/**
 * Sort numbers from a text file (marks)
 * Use ArrayList to allow array of indeterministic size
 * Alternatively copy the data to an array and use the same implementation as Question 3.1
 * @author Yukun
 */
import java.io.*;
import java.util.*;

public class SortNumbers2 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ArrayList<Integer> marks = new ArrayList<Integer>();
        
        // read marks from the file
        try
        {
            Scanner scanner = new Scanner(new File("numbers"));
            while (scanner.hasNextInt())
            {
                marks.add(scanner.nextInt());
            }
            scanner.close();
        }
        catch (IOException ioe)
        {
            System.out.println(ioe);
            System.exit(1);
        }
        
        // choose one of the following:
        
        // bubble_sort(marks);    // other sorting method is also fine
        system_sort(marks);    // sort using system API
        
        
        for (int i = 0; i < marks.size(); i++)
        {
            System.out.println(marks.get(i));
        }
    }
    
   // method to sort an array list using a bubble sort in descending order
   // length is the actual number of marks
   public static void bubble_sort( ArrayList<Integer> marks )
   {
      int i, j, temp;
      for ( i = 0; i < marks.size() - 1; i++ )
      {
         for ( j = marks.size() - 1; j > i; j-- )
         {
            if ( marks.get(j) > marks.get(j-1) )
            {
               temp = marks.get(j);
               marks.set(j, marks.get(j - 1));
               marks.set(j - 1, temp);
            }
         }
      }
   }    
   
   // method to sort an array using Arrays.sort in descending order
   public static void system_sort (ArrayList<Integer> marks)
   {
       // sort in the ascending order using Collections.sort (similar to Arrays.sort for arrays)
       Collections.sort(marks);
       // reverse the order => descending order
       for (int i = 0; i < marks.size() / 2; i++)
       {
           int temp = marks.get(i);
           marks.set(i, marks.get(marks.size() - i - 1));
           marks.set(marks.size() - i - 1, temp);
       }
       
       // Alternatively use the following to sort in descending order
       // Collections.sort(marks, Collections.reverseOrder());
   }
}
