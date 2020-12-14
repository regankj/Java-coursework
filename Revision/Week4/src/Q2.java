import java.util.Random;

public class Q2 {
    public static void main( String[] args ){
        Random generator = new Random();
        for (int i = 1; i <= 20; i++){
            double num = Math.abs(generator.nextDouble()) % 5 + 4;
            System.out.println(num + " ");
        }
    }
}
