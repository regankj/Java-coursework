/**
 * Random number generation
 * @author Yukun
 */
import java.util.Random;
public class Random2
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Random generator = new Random();
        for (int i = 0; i < 20; i++)
        {
            double n = generator.nextDouble() * 4 + 4;   // 4--8
            System.out.println(n);
        }
        System.out.println();
    }
}
