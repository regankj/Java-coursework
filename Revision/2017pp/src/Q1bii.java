import java.util.Random;

public class Q1bii {
    public static void main(String[] args){
        Random generator = new Random();
        int[] nums = {100};
        for (int i = 0; i < 100; i++){
            int num = Math.abs(generator.nextInt()) % 11 + 5;
            num = nums[i];
        }

    }
}
