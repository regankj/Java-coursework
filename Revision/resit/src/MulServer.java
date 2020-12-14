import java.util.*;
import java.io.*;
import java.net.*;

public class MulServer {
    public static void main(){
        ServerSocket sSock = null;
        try{
            sSock = new ServerSocket(7000);
        }
        catch (IOException e){
            System.err.println(e);
            System.exit(1);
        }
        Random generator = new Random();
        int a = generator.nextInt() % 10;
        int b = generator.nextInt() % 10;
        final String[] ret_msg = {null};

        while (true){
            try {
                Socket sock = sSock.accept();
                Thread serverThread = new Thread(){
                    public void run(){
                        try {
                           BufferedReader in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
                           String t = null;
                           while ((t = in.readLine()) != null){
                               try{
                                   int result = Integer.parseInt(t);
                                   if (a*b == result){
                                       ret_msg[0] = "Correct";
                                   }
                                   else {
                                       ret_msg[0] = "Incorrect";
                                   }
                               }
                               catch (NumberFormatException e) {
                                   e.printStackTrace();
                               }
                           }
                        }
                        catch (IOException e) {
                            System.err.println(e);
                        }
                        try {
                            PrintWriter ps = new PrintWriter(sock.getOutputStream());
                            ps.println(ret_msg[0]);
                            ps.flush();
                        }
                        catch (IOException e){
                            System.err.println(e);
                        }
                    }
                };
                serverThread.start();
            }
            catch (IOException ioe){
                System.err.println(ioe);
            }
        }
    }
}
