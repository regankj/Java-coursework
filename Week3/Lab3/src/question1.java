import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class question1 {
    public static void main(String[] args){
        int num = 0;
        double[] x = null;
        double[] y = null;
        try {
            FileReader reader = new FileReader("Q1.txt");
            Scanner scanner = new Scanner(reader);
            num = scanner.nextInt();
            x = new double[num];
            y = new double[num];
            for (int i=0; i < num; i++){
                x[i] = scanner.nextDouble();
                y[i] = scanner.nextDouble();
            }

            scanner.close();
            reader.close();
        }
        catch (IOException ioe){
            System.out.println(ioe);
            System.exit(1);
        }
        for (int i=0; i < num; i++){
            System.out.println("(" + x[i] + ", " + y[i] + ")");
        }
    }
}
