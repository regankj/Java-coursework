public class Q1 {
    public static void main( String[] args ){
        int [] nums = {3, 5, 7, 9, 10};
        int sum = 0;
        for (int i=0; i < nums.length; i++){
            sum = sum + nums[i];
        }
        System.out.println("Sum is " + sum);
    }
}
