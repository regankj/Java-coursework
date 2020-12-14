/**
 *
 * @author Yukun
 */
public class Addition 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int total = 0;
        for( int value = 1; value <= 10; value++ ) 
        {
            total = total + value; 
        }
        System.out.println( "Total = " + total ); 
    }
}
