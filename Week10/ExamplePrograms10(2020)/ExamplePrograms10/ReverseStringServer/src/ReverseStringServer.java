import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
public class ReverseStringServer 
{ 
   public static void main( String args[] ) 
   {
      ServerSocket sSock = null;
      try 
      {
         sSock = new ServerSocket( 1234 );
      } 
      catch( IOException e ) 
      { 
         System.err.println( e ); 
         return;
      }
      System.out.println( "Server running..." );
      while ( true ) 
      {
         try 
         {
            Socket sock = sSock.accept();  
            BufferedReader in = new BufferedReader( 
              new InputStreamReader( sock.getInputStream() ) );
            // read a string and return a reversed string
            String t = in.readLine();
            if ( t != null ) 
            {
               PrintWriter ps = 
                     new PrintWriter( sock.getOutputStream() ); 
               ps.println( new String( 
                           new StringBuffer( t ).reverse() ) );
               ps.flush();
            }
            // close client socket
            sock.close();
         } 
         catch( IOException e ) 
         { 
            System.err.println( e ); 
         }
      }
   }
}
