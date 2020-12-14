// Output.java
// A class providing useful methods for output.

public class Output {

   public static void printArray( int[] a ) {
      for ( int i = 0; i < a.length; ++i ) {
         System.out.print( a[i] );
         if ( i < a.length - 1 )
            System.out.print( ", " );
      }
      System.out.println();
   }

   public static void printArray( String[] a ) {
      for ( int i = 0; i < a.length; ++i ) {
         System.out.print( a[i] );
         if ( i < a.length - 1 )
            System.out.print( ", " );
      }
      System.out.println();
   }

}