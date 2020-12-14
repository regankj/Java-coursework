public class ArraySum {
    public static void main(String[] args){
        int[] nums = {3, 5, 7, 9, 10};
        int sum = 0;
        for(int number: nums){
            sum += number;
        }
        System.out.println("The sum is " + sum);
    }
}
