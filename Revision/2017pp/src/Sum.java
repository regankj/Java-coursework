import java.io.*;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        if (args.length != 1){
            System.err.println("One argument expected!");
            System.exit(1);
        }
        Scanner in = new Scanner(System.in);
        int total = 0;
        String fileName = in.nextLine();

        try {
            Scanner file = new Scanner(new File(fileName));
            while (file.hasNextInt()){
                int num = file.nextInt();
                total += num;
                System.out.println(num);
                
            }
            System.out.println(total);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
