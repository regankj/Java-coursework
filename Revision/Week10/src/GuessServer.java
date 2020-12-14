import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class GuessServer {

    public static void main( String[] args ){
        ServerSocket sSock = null;
        try {
            sSock = new ServerSocket(1234);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Server running...");
        Random generator = new Random();

        while (true){
            try {
                Socket sock = sSock.accept();

                Thread serverThread = new Thread(){
                    public void run(){
                        try{
                            BufferedReader in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
                            int number = generator.nextInt(999) + 1;
                            String t = null;
                            while ( (t = in.readLine()) != null){
                                String ret_msg = "*";
                                try {
                                    int value = Integer.parseInt(t);
                                    if (value < number){
                                        ret_msg = "<";
                                    }
                                    else if (value > number) {
                                        ret_msg = ">";
                                    }
                                    else {
                                        ret_msg = "=";
                                    }
                                } catch (NumberFormatException e) {
                                    e.printStackTrace();
                                }
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                };

                serverThread.start();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
