import java.io.*;
import java.net.*;
import java.util.*;

public class LoginServer {
    public static void main(String[] args){
        DatagramSocket socket = null;
        String[] users = {};
        String[] pwds = {};
        String result = "";
        try {
            socket = new DatagramSocket(7000);
        } catch (SocketException e) {
            e.printStackTrace();
        }

        while (true){
            byte[] data = new byte[100];

            DatagramPacket recievePacket = new DatagramPacket(data, data.length);
            try {
                socket.receive(recievePacket);
                for (int i = 0; i < users.length; i++){
                    while (args[0] != users[i] && args[1] != pwds[i]){
                        continue;
                    }
                    result = "Successful";
                    System.out.println(result);
                }
            } catch (IOException e) {
                result = "Unsuccessful";
                System.out.println(result);
                e.printStackTrace();
            }
            String response = String.valueOf(result);
            byte resp[] = response.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(resp, resp.length, recievePacket.getAddress(), recievePacket.getPort());
            try {
                socket.send(sendPacket);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
