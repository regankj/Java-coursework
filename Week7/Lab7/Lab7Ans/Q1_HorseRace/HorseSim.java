/**
 * Horse Simulator
 * @author Yukun
 *
 */
public class HorseSim 
{
	public static void main(String[] args)
	{
		final int HORSE_NUM = 10;
		HorseThread[] horses = new HorseThread[HORSE_NUM];
		for (int i = 0; i < HORSE_NUM; i++)
		{
			horses[i] = new HorseThread(i);
			horses[i].start();
		}
		try
		{
			for (int i = 0; i < HORSE_NUM; i++)
			{
				horses[i].join();
			}
		}
		catch (InterruptedException ie)
		{
			
		}
		
		int best_horse = -1;
		int best_time = Integer.MAX_VALUE;
 
		for (int i = 0; i < HORSE_NUM; i++)
		{
			int t = horses[i].getTime();
			if (t < best_time)
			{
				best_time = t;
				best_horse = i;
			}
		}
		System.out.println("Winner: " + best_horse);
	}

}
