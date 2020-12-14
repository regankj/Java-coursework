import java.util.Random;

public class random1 {
    public static void main(String[] args){
        Random generator = new Random();
        for (int i = 1; i <=16; i++){
            int number = Math.abs(generator.nextInt(4)) + 3;
            System.out.print( number + " " );
        }
        System.out.println( "" );
    }
}
