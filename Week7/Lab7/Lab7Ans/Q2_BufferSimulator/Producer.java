import java.util.Random;
/**
 * Producer that generates data and put in the buffer
 * @author Yukun
 *
 */
public class Producer extends Thread 
{
	private Buffer buffer;
		
	public Producer (Buffer buf)
	{
		buffer = buf;
	}
	
	public void run()
	{
		Random random = new Random();
		for (int i = 0; i < 100; i++)
		{
			if (buffer.isFull())
			{
				System.out.println("Buffer full");
			}
			else
			{
				buffer.put(i+1);
				System.out.println("Put: " + (i+1));
			}
			int t = random.nextInt(101) + 50;
			try
			{
				Thread.sleep(t);
			}
			catch (InterruptedException ie)
			{
				System.out.println("Interrupted");
			}
		}
	}
}
