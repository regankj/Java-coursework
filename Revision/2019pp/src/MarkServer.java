import java.io.IOException;
import java.net.*;

public class MarkServer {
    public static void server(String [] IDs, int [] marks) throws IOException {
        DatagramSocket socket = null;
        try {
            socket = new DatagramSocket(6000);
        } catch (SocketException e) {
            e.printStackTrace();
        }

        while (true){
            byte data[] = new byte[100];
            DatagramPacket recievePacket = new DatagramPacket(data, data.length);
            socket.receive(recievePacket);
            String str = new String(recievePacket.getData(), 0, recievePacket.getLength());
            String ID = "c1991547";
            int mark = 0;
              try {
                  for (int i = 0; i < IDs.length; i++){
                      if (ID == IDs[i]){
                          mark = marks[i];
                      }
                  }
              } catch (Exception e) {
                  e.printStackTrace();
              }
              String response = String.valueOf(mark);
              byte resp[] = response.getBytes();
              DatagramPacket sendPacket = new DatagramPacket(resp, resp.length, recievePacket.getAddress(), recievePacket.getPort());
              socket.send(sendPacket);
        }

    }


}
