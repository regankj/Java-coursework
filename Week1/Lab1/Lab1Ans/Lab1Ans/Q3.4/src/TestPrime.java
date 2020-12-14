/**
 *
 * @author Yukun
 */
public class TestPrime 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int num = 1023;
        boolean isPrime = true;
        if (num <= 1)
        {
            isPrime = false;
        }
        else 
        {
            // Note: a quicker alternative way is to test from 2 to sqrt(num)
            for (int i = 2; i < num; i++)
            {
                if (num % i == 0) // if divisible by any number other than 1 and itself
                {
                    isPrime = false;
                }
            }
        }
        
        if (isPrime)
        {
            System.out.println(num + " is a prime number");
        }
        else
        {
            System.out.println(num + " is not a prime number");
        }
    }
}
