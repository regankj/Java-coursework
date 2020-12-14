public class ArraySum {
   public static void main( String args[] ) {
   	
   	// Q6
   	int [] nums = {3,5,7,9,10};
   	int sum = 0;

   	for( int i = 0; i < nums.length; i++ ){
   		sum += nums[i];
   	}
   	System.out.println("Sum is: " + sum);

   }
}