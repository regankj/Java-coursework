/**
 *
 * @author Yukun
 */
public class LeapYear 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int year = 2100;
        if ((year%100 != 0 && year%4 == 0) || (year%100 == 0 && year%400 == 0))
        {
            System.out.println("Year " + year + " is a leap year");
        }
        else
        {
            System.out.println("Year " + year + " is not a leap year");
        }
    }
}
