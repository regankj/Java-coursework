/**
 * Guess game server Multi-Threaded
 * @author Yukun
 */

import java.io.*;
import java.net.*;
import java.util.Random;

public class GuessServerMT 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ServerSocket sSock = null;
        try
        {
            sSock = new ServerSocket(1234); // Create server socket listening at port 1234
        }
        catch (IOException e)
        {
            System.err.println(e);
            return;
        }
        
        System.out.println("Server running...");
        Random generator = new Random();
        // wait for connections
        // we assume one connection at a time
        // use multi-threading to handle multiple connections at the same time
        while (true)
        {
            try
            {
                Socket sock = sSock.accept();
                
                Thread serverThread = new Thread()
                {
                	public void run()
                	{
                		try
                		{
	                		BufferedReader in = new BufferedReader (
	                                        new InputStreamReader( sock.getInputStream() ));
			                // generate random number for guessing
			                int number = generator.nextInt(999) + 1; // 1--999 inclusive
			                String t = null;
			                while (( t = in.readLine()) != null ) // receive a guessed number
			                {
			                    // return message, < too small; > too large; = correct; * wrong format
			                    String ret_msg = "*";
			                    try
			                    {
			                        int value = Integer.parseInt(t);
			                        if (value < number)
			                        {
			                            ret_msg = "<";
			                        }  // too small
			                        else if (value > number)
			                        {
			                            ret_msg = ">";
			                        } // too large
			                        else
			                        {
			                            ret_msg = "=";
			                        } // correct
			                    }
			                    catch (NumberFormatException nfe)
			                    {
			                        System.err.println("Wrong input from the client: " + t);
			                    }
			                    
			                    PrintWriter ps = new PrintWriter(sock.getOutputStream());
			                    ps.println(ret_msg);
			                    ps.flush();
			                }
			                // close client socket
			                sock.close();
                		}
                		catch (IOException ioe)
                        {
                            System.err.println(ioe);               
                        }
                	}
                };
                
                serverThread.start();
            }
            catch (IOException ioe)
            {
                System.err.println(ioe);               
            }
        }
    }
}
