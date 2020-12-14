import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Scanner;

public class WeightServer {

    public static void main(String[] args){
        try{
            DatagramSocket socket = new DatagramSocket(5000);
            System.out.println("Weight server running...");
            while (true){
                byte data[] = new byte[100];
                DatagramPacket receivePacket = new DatagramPacket(data, data.length);
                socket.receive(receivePacket);
                String msg = new String(receivePacket.getData(), 0, receivePacket.getLength());
                Scanner scanner = new Scanner(msg);

                int lb = scanner.nextInt();
                int oz = scanner.nextInt();
                double grams = 453.6 * lb + 28.35 * oz;

                byte[] sendBuffer = String.valueOf(grams).getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, receivePacket.getAddress(), receivePacket.getPort());
                socket.send(sendPacket);
                System.out.println(lb + " lb " + oz + " oz = " + grams + " g");

            }
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
