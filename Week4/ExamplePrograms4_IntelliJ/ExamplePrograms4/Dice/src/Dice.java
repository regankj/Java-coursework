import java.util.Random;

// Generate 24 numbers between 1 and 6s
public class Dice
{
   public static void main( String[] args )
   {
      Random generator = new Random();
      for ( int i = 1; i <= 24; i++ )
      {
         // int number = 
         //      Math.abs( generator.nextInt() ) % 6 + 1;
		 int number = generator.nextInt(6) + 1;	 // the same as above code (commented out)
         System.out.print( number + " " );
      }
      System.out.println( "" ); 
   }
}
