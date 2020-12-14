/**
 *
 * @author Yukun
 */
public class WhileLoop 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int sum = 0;
        int value = 2;
        while (value <= 16)
        {
            sum += value;
            value += 2;
        }
        System.out.println(sum);
    }
}
