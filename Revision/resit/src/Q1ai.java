

public class Q1ai {
    public static void main(String[] args){
        int[] nums = {3,12,12,4,6,5,8};
        int secondLarge = 0;
        int pos = 0;
        int Largest = 0;
        for (int i= 1; i < nums.length; i++){
            if (nums[i] > nums[i-1] && nums[i] > Largest) {
                Largest = nums[i];
            }
        }

        for (int j = 1; j < nums.length; j++){
            if ( (nums[j] > nums[j-1]) && (nums[j] > secondLarge) && (nums[j] < Largest) ){
                secondLarge = nums[j];
            }
        }
        System.out.println(secondLarge);
    }
}
