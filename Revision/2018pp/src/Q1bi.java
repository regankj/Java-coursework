public class Q1bi {
    public static void main(String[] args){
        double[] nums = {2,3,5,7,10,12};
        double value = 0;
        int pos = 0;
        for (int i=1; i < nums.length; i++){
            if (nums[i] > nums[i-1]){
                value = nums[i];
                pos = i;
            }
            else {
                value = nums[i-1];
                pos = i - 1;
            }
        }
        System.out.println("largest value is " + value + " at position " + pos);
    }
}
