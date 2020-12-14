/**
 *
 * @author Yukun
 */
public class MoreAdditions 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // initialise the sum to zero
        int sum = 0;
        
        for (int value = 2; value <= 16; value += 2)
        {
            sum += value;
        }
                
        System.out.println(sum);
    }
}
