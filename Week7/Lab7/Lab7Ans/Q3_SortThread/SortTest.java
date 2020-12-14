import java.util.Random;

/**
 * Bubble Sort comparison using 1 and 2 threads
 * @author Yukun
 *
 */
public class SortTest
{
	public static void main(String[] args)
	{
        final int N = 100000; // number of elements
        // generate N random integers
        int[] data = new int[N];
        Random rnd = new Random();
        for (int i = 0; i < N; i++)
        {
            data[i] = rnd.nextInt();
        }
        
        // make an identical copy
        int[] data2 = new int[N];
        System.arraycopy(data, 0, data2, 0, N);
        
        long time1 = System.nanoTime();   // get the time before calculation
        SortThread.BubbleSort(data, 0, N/2-1);
        SortThread.BubbleSort(data, N/2, N-1);
        long time2 = System.nanoTime();
        System.out.println("BubbleSort 1 Thread: " + (time2-time1)/1000000 + " ms");
        
        long time3 = System.nanoTime();
        SortThread thread1 = new SortThread(data2, 0, N/2-1);
        SortThread thread2 = new SortThread(data2, N/2, N-1);
        thread1.start();
        thread2.start();
        try
        {
        	thread1.join();
            thread2.join();
        }
        catch (Exception e)
        {
        	System.err.println(e);
        }
        
        long time4 = System.nanoTime();
        System.out.println("BubbleSort 2 Threads: " + (time4-time3)/1000000 + " ms");
	}
	
}
