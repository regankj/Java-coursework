import java.net.*;
import java.io.*;
import javafx.application.Platform;

public class UDPClientTimeoutThread extends Thread
{
	public UDPClientTimeoutThread(UDPClientTimeoutTest app)
	{
		MainApp = app;
	}
	
	public void SendPacket(String msg)
	{
		try
        {
			byte data[] = msg.getBytes();
	        // destination: local machine, port: 5000
	        sendPacket = new DatagramPacket( data, data.length, 
	                              InetAddress.getLocalHost(), 5000 );
	        socket.send( sendPacket );
        }
        catch ( UnknownHostException uhe )
        {
           uhe.printStackTrace();
           System.exit( 3 );
        }
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
	public void ReceivePacket()
	{
		try
		{
            //
            // Set up packet as buffer
            //
            byte data[] = new byte[ 100 ];
            receivePacket = new DatagramPacket( data,
                                                    data.length );
            //
            // Wait for packet
            //
            socket.receive( receivePacket );
            //
            // Disable timeout
    		// when the first echo packet is received
            //
            socket.setSoTimeout( 0 );
		}
        // This code is entered when nothing is received in
        // 5 seconds
        //
        catch ( InterruptedIOException iioe )
		{
        	receivePacket = null;
        	Platform.runLater(new Runnable() {
        	 public void run() {
        		 MainApp.AppendDisplay("Server not available\n" );
        	 }
        	});
        	SendPacket(connectString);
		}
		catch (IOException ioe)
		{
            ioe.printStackTrace();    
		}
	}
	
	public void run()
	{
        try
	    {
	        //
	        // Create a socket
	        //
	        socket = new DatagramSocket();
	        //
	        // Set 5 second timeout
	        //
	        socket.setSoTimeout( 5000 );
	        SendPacket(connectString);
	        
	        while ( true )
	        {
	           ReceivePacket();	// info in receivePacket object
	           if (receivePacket == null)
	        	   continue;
	           
	           String info = "\nPacket received" + "\nFrom host: " 
                       + receivePacket.getAddress() + "\nHost port: "
                       + receivePacket.getPort() + "\nlength: " 
                       + receivePacket.getLength() + "\nContaining: "
                       + new String( receivePacket.getData(), 0, receivePacket.getLength() ) ; 
	           Platform.runLater(new Runnable() {
	        	public void run()
	           	{
	           		MainApp.AppendDisplay(info);
	           	}
	           }
	           );
	        }
	    }
	    catch ( SocketException se )
	    {
	       se.printStackTrace();
	       System.exit( 1 );
	    }
		
	}
	
	private UDPClientTimeoutTest MainApp;
    private DatagramPacket sendPacket, receivePacket;
	private DatagramSocket socket;
	String connectString = "***";  // a message when the client starts
}
