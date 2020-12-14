// Print the reversed string
public class Reverse
{
   public static void main( String[] args )
   {
      // Create a StringBuffer containing specified
      // String and an extra 16 unused characters.
      StringBuffer buffer = new StringBuffer( "cat" );
      buffer.reverse();
      System.out.println( buffer.toString() );
   }
}
