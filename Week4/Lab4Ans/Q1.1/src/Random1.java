/**
 * Random number generation
 * @author Yukun
 */
import java.util.Random;
public class Random1 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Random generator = new Random();
        for (int i = 0; i < 16; i++)
        {
            int n = generator.nextInt(4) + 3;   // 3+0 -- 3+3
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
