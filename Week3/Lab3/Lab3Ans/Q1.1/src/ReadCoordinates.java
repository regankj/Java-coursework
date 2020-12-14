/**
 * Read coordinates from a text file and display
 * @author Yukun
 */
import java.io.*;
import java.util.Scanner;
public class ReadCoordinates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Scanner is used here as it is simpler
        int num = 0;
        double[] x = null;
        double[] y = null;
        try
        {
            FileReader reader = new FileReader("Coords.txt");
            Scanner scanner = new Scanner(reader);
            num = scanner.nextInt();
            x = new double[num];
            y = new double[num];
            for (int i = 0; i < num; i++)
            {
                x[i] = scanner.nextDouble();
                y[i] = scanner.nextDouble();
            }
        
            scanner.close();
            reader.close();
        }
        catch (IOException ioe)
        {
            System.out.println(ioe);
            System.exit(1);
        }
        
        for (int i = 0; i < num; i++)
        {
            System.out.println("(" + x[i] + ", " + y[i] + ")");
        }
    }
}
