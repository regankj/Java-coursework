import java.util.Random;

public class Q1bii {
    public static void main(String[] args){
        Random generator = new Random();
        int[] nums = {};
        for (int i = 0; i < 10; i++){
            nums[i] = Math.abs(generator.nextInt()) % 10000 + 1000;
        }
    }
}
