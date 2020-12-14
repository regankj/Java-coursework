/**
 * Implementation for Sorting
 * @author Yukun
 *
 */
public class SortThread extends Thread 
{
    private int[] m_data;   // reference to the data array
    private int m_start;    // the starting index of the array
    private int m_end;      // the ending index of the array

    SortThread(int[] data, int start, int end)
    {
        m_data = data;
        m_start = start;
        m_end = end;    	
    }
    
	public void run()
	{
		BubbleSort(m_data, m_start, m_end);
	}
	
	/**
	 * Bubble sort for a range of array 
	 * @param data: the data array
	 * @param start: start index (inclusive)
	 * @param end: end index (inclusive)
	 */
	public static void BubbleSort(int[] data, int start, int end)
	{
		for (int i = 0; i < end-start; i++)
		{
			for (int j = end; j >= start + i + 1; j--)
			{
				if (data[i] > data[j])
				{
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
	}

}
