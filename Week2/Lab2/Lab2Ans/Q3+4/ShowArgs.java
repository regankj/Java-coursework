public class ShowArgs {
    public static void main(String[] args) {
        
        System.out.println( "The number of command line arguments provided is: " + args.length);
        for ( int i = 0; i < args.length; i++ ){
        	System.out.println( args[i] );
        }

        for( String inputs : args ) {
			System.out.println( inputs ); 
		}

    }
}