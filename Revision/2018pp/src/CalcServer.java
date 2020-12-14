import java.util.*;
import java.net.*;
import java.io.*;

public class CalcServer {
    public static void main(String[] args){
        ServerSocket sSock = null;
        try {
            sSock = new ServerSocket(6000);

        }
        catch (IOException e){
            System.err.println(e);
        }


        while (true){
            try {
                Socket sock = sSock.accept();
                final double[] num = {0.0};
                Thread serverThread = new Thread(){
                    public void run(){
                       try {
                           BufferedReader in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
                           String t = null;
                           while ( (t = in.readLine()) != null){
                               try{
                                   String operator = args[0];
                                   double operand = Double.parseDouble(args[1]);
                                   if (operator == "+"){
                                       num[0] += operand;
                                   }
                                   else if (operator == "*"){
                                       num[0] *= operand;
                                   }
                                   else if (operator == "-"){
                                       num[0] -= operand;
                                   }
                                   else {
                                       if (operand == 0){
                                           System.out.println("Error! cannot divide by zero");
                                       }
                                       else {
                                           num[0] = num[0] / operand;
                                       }
                                   }

                               } catch (NumberFormatException e) {
                                   e.printStackTrace();
                               }

                           }

                       } catch (Exception e) {
                           e.printStackTrace();
                       }
                    }
                };
                serverThread.start();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
