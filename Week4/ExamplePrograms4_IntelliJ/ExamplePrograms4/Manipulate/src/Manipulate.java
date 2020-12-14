public class Manipulate
{
   public static void main( String[] args )
   {
      // Create a StringBuffer containing specified String 
      // and an extra 16 unused characters.
      StringBuffer buffer = new StringBuffer( "cat" );

      // Display a character in the StringBuffer
      char ch = buffer.charAt( 1 );
      System.out.println( String.valueOf( ch ) );

      // Change a character in the StringBuffer
      buffer.setCharAt( 1, 'o' );
      System.out.println( buffer.toString() );

      // Insert a character in the StringBuffer
      buffer.insert( 2, 's' );
      System.out.println( buffer.toString() );

      // Add characters to the StringBuffer
      buffer.append( "ly" );
      System.out.println( buffer.toString() );

      // Display a portion of the StringBuffer
      System.out.println( buffer.substring( 0, 3 ) );

      // Delete characters from the StringBuffer
      buffer.deleteCharAt( 2 );
      buffer.delete( 3, 5 );
      System.out.println( buffer.toString() );
      String str = "art";
      buffer.replace( 1, 3, str );
      System.out.println( buffer.toString() );
   }
}
