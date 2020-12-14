/**
 * Guess game client
 * @author Yukun
 */

import java.io.*;
import java.net.*;

public class GuessClient 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // keyboard input
        BufferedReader kbin = new BufferedReader (
                new InputStreamReader (System.in )) ;
        
        try
        {
            // connect to the server
            Socket sock = new Socket(InetAddress.getLocalHost(), 1234);
            // output message using PrintWriter
            PrintWriter out = new PrintWriter(sock.getOutputStream());
            // input message using BufferedReader
            BufferedReader in = new BufferedReader (
                    new InputStreamReader (sock.getInputStream()));
            
            String s;
            System.out.print("Enter number to guess >> ");
            while ((s = kbin.readLine()) != null)
            {
                // given the input from the console, send it to the server
                out.println(s);
                out.flush();
                
                // read back from the server
                // <: too small
                // >: too large
                // =: correct
                // *: invalid input
                String t = in.readLine();
                if (t == null)
                {
                    break;
                }
                else
                {
                    if (t.equals("<"))
                    {
                        System.out.println("Too small");
                    }
                    else if (t.equals(">"))
                    {
                        System.out.println("Too large");
                    }
                    else if (t.equals("="))
                    {
                        System.out.println("Correct!");
                        break;      // game finishes
                    }
                    else    // incorrect input
                    {
                        System.out.println("Input incorrect!");
                    }
                }
                
                System.out.print("Enter number to guess >> ");                
            }
            
            // close client socket
            sock.close();
        }
        catch (IOException ioe)
        {
            System.err.println(ioe);
        }
    }
}
