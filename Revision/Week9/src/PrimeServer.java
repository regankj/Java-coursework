import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class PrimeServer {
    public static void main(String[] args){
        DatagramSocket socket = null;
        try {
            socket = new DatagramSocket(5000);
        } catch (SocketException e) {
            e.printStackTrace();
        }
        System.out.println("Server running....");

        while (true){
            try {
                byte data[] = new byte[ 100 ];
                DatagramPacket recievePacket = new DatagramPacket(data, data.length);
                socket.receive(recievePacket);
                String str = new String(recievePacket.getData(), 0, recievePacket.getLength());
                int num = 5;
                try {
                    num = Integer.parseInt(str);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                String response = String.valueOf(isPrime(num));
                byte resp[] = response.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(resp, resp.length, recievePacket.getAddress(), recievePacket.getPort());
                socket.send(sendPacket);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    private static boolean isPrime(int num){
        if (num < 2){
            return false;
        }
        else {
            for (int i = 2; i < num; i++){
                if (num % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}
