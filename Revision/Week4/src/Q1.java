import java.util.Random;

public class Q1 {
    public static void main( String[] args ){
        Random generator = new Random();
        for (int i = 0; i <= 16; i++){
            int num = Math.abs(generator.nextInt()) % 4 + 3;
            System.out.println(num + " ");
        }
        System.out.println( "" );
    }
}
