import java.util.*;
import java.util.Map;
import java.util.Scanner;
import java.io.*;

public class Login {
    private static void main(String [] args){
            Map<String, String> users = new HashMap<String, String>();
            try{
                Scanner scan = new Scanner(new File("users.txt"));
                while (scan.hasNext()){
                    String user = scan.next();
                    String pass = scan.next();
                    users.put(user, pass);
                }
                scan.close();
            }
            catch (IOException ioe){
                System.err.println(ioe);
                System.exit(-1);
            }
            Scanner stdin = new Scanner(System.in);
            System.out.print("Enter user name: ");
            String user = stdin.nextLine();
            System.out.print("Enter password: ");
            String pass = stdin.nextLine();

            if (users.containsKey(user) && users.get(user).equals(pass))
                System.out.println("Logged in successfully!");
            else if (users.containsKey(user))
                System.out.println("Incorrect password");
            else
                System.out.println("User does not exist!");
    }
}
