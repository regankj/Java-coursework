import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class GuessClient {

    public static void main(String[] args) throws IOException {
        BufferedReader kbin = new BufferedReader(
                new InputStreamReader(System.in)
        );

        try{
            Socket sock = new Socket(InetAddress.getLocalHost(), 1234);
            PrintWriter out = new PrintWriter(sock.getOutputStream());
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(sock.getInputStream())
            );

            String s;
            System.out.print("Enter number to guess >> ");
            while ((s = kbin.readLine()) != null){
                out.println(s);
                out.flush();

                String t = in.readLine();
                if (t == null){
                    break;
                }
                else{
                    if (t.equals("<")){
                        System.out.println("Too small");
                    }
                    else if (t.equals(">")) {
                        System.out.println("Too Large");
                    }
                    else if (t.equals("=")){
                        System.out.println("Correct!");
                        break;
                    }
                    else {
                      System.out.println("Input Incorrect!");
                    }
                }
                System.out.print("Enter a number to guess >> ");
            }
            sock.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
