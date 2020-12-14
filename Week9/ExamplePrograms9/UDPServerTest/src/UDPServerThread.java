import java.io.*;
import java.net.*;
import javafx.application.Platform;

public class UDPServerThread extends Thread 
{
	public UDPServerThread(UDPServerTest app)
	{
		MainApp = app;
	}

	public void run()
	{
		try
	    {
			// construct a socket on port 5000
			socket = new DatagramSocket( 5000 );
	    }
	    catch ( SocketException se )
	    {
	    	se.printStackTrace();
	    	System.exit( 1 );
	    }
		
	    while ( true )
	    {
	    	try 
	    	{
	           //
	           // Set up a buffer packet
	           //
	           byte data[] = new byte[ 100 ];
	           receivePacket = new DatagramPacket( data, data.length );
	           //
	           // Wait for packet
	           //
	           socket.receive( receivePacket );
	           //
	           // Process packet
	           //
	           sendPacket = 
	                     new DatagramPacket( receivePacket.getData(),
	                                        receivePacket.getLength(),
	                                       receivePacket.getAddress(),
	                                        receivePacket.getPort() );
        	   //
	           // Echo information back to client
	           //
	           socket.send( sendPacket );

	           
	           // Update UI
	           String info = "\nPacket received from host: "
	                    + receivePacket.getAddress() + "\nHost port: "
	                    + receivePacket.getPort() + "\nLength: " 
	               + receivePacket.getLength() + "\nContents: "
	               + new String( receivePacket.getData(), 0, receivePacket.getLength() );
	           
               Platform.runLater(new Runnable() {                   
                   public void run () {
	        			MainApp.AppendDisplay( info );
                       MainApp.AppendDisplay( "\n\nEcho data to client\n");
                       MainApp.AppendDisplay( "Packet sent\n" );
                   }
               });
	         }
	         catch ( IOException ioe )
	         {
	            ioe.printStackTrace();
	         }
	      }
	}
	
	private UDPServerTest MainApp;
	private DatagramPacket sendPacket, receivePacket;
	private DatagramSocket socket;
}
