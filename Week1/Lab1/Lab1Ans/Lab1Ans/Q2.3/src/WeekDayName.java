/**
 *
 * @author Yukun
 */
public class WeekDayName 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int weekDay = 5;
        String wdName;
        switch (weekDay)
        {
            case 0: wdName = "Sunday"; break;
            case 1: wdName = "Monday"; break;
            case 2: wdName = "Tuesday"; break;
            case 3: wdName = "Wednesday"; break;
            case 4: wdName = "Thursday"; break;
            case 5: wdName = "Friday"; break;
            case 6: wdName = "Saturday"; break;
            default: wdName = "Invalid Weekday"; break;
        }
        
        System.out.println(wdName);
    }
}
