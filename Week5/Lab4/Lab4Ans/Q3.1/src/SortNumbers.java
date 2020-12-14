/**
 * Sort numbers from a text file (marks)
 * @author Yukun
 */
import java.io.*;
import java.util.*;

public class SortNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int marks [] = new int [100];     // pre-allocate the space, assume no more numbers than this
        int num = 0;
        
        // read marks from the file
        try
        {
            Scanner scanner = new Scanner(new File("marks"));
            while (scanner.hasNextInt())
            {
                marks[num++] = scanner.nextInt();
            }
            scanner.close();
        }
        catch (IOException ioe)
        {
            System.out.println(ioe);
            System.exit(1);
        }
        
        // choose one of the following:
        
        // bubble_sort(marks, num);    // other sorting method is also fine
        system_sort(marks, num);    // sort using system API
        
        
        for (int i = 0; i < num; i++)
        {
            System.out.println(marks[i]);
        }
    }
    
   // method to sort an array using a bubble sort in descending order
   // length is the actual number of marks
   public static void bubble_sort( int[] marks,  int length )
   {
      int i, j, temp;
      for ( i = 0; i < length - 1; i++ )
      {
         for ( j = length - 1; j > i; j-- )
         {
            if ( marks[ j ] > marks[ j - 1 ] )
            {
               temp = marks[ j ];
               marks[ j ] = marks[ j - 1 ];
               marks[ j - 1 ] = temp;
            }
         }
      }
   }    
   
   // method to sort an array using Arrays.sort in descending order
   public static void system_sort (int [] marks, int length)
   {
       // sort in the ascending order using Arrays.sort
       Arrays.sort(marks, 0, length);
       // reverse the order => descending order
       for (int i = 0; i < length / 2; i++)
       {
           int temp = marks[i];
           marks[i] = marks[length - i - 1];
           marks[length - i - 1] = temp;
       }
   }
}
