import java.io.IOException;
import java.net.*;

public class PrimeClient {
    public static void main(String[] args){
        if (args.length != 2){
            System.err.println("java PrimeClient <host> <number>");
            return;
        }
        try {
            DatagramSocket socket = new DatagramSocket();
            byte[] data = args[1].getBytes();
            DatagramPacket sendPacket = new DatagramPacket(data, data.length, InetAddress.getByName(args[0]), 5000);
            socket.send(sendPacket);

            byte[] buffer = new byte[100];
            DatagramPacket receivePacket = new DatagramPacket(buffer, buffer.length);
            socket.receive(receivePacket);
            String resp = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println(resp);
            socket.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
