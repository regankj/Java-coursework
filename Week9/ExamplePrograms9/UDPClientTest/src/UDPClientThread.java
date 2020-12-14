import java.net.*;
import java.io.*;
import javafx.application.Platform;

public class UDPClientThread extends Thread
{
	public UDPClientThread(UDPClientTest app)
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
	        while ( true )
	        {
	           ReceivePacket();	// info in receivePacket object
	           String info = "\nPacket received" + "\nFrom host: " 
                       + receivePacket.getAddress() + "\nHost port: "
                       + receivePacket.getPort() + "\nlength: " 
                       + receivePacket.getLength() + "\nContaining: "
                       + new String( receivePacket.getData(), 0, receivePacket.getLength() ) ; 
               Platform.runLater(new Runnable() {
                   public void run() {        
                	   MainApp.AppendDisplay(info);
                   }
               });
	        }
	    }
	    catch ( SocketException se )
	    {
	       se.printStackTrace();
	       System.exit( 1 );
	    }
		
	}
	
	private UDPClientTest MainApp;
    private DatagramPacket sendPacket, receivePacket;
	private DatagramSocket socket;
}
