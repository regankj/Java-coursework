import java.util.Arrays;

public class SortNumbers {
    public static void main(String[] args){
        int[] nums = {12, 6, 32, 3, 23, 19};
        Arrays.sort(nums);
        for (int item : nums){
            System.out.print(item + " ");
        }
    }
}

