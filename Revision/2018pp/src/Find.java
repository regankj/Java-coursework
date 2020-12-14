import java.io.*;
import java.util.Scanner;

public class Find {
    public static void main(String[] args){
        if (args.length != 2){
            System.err.println("Two args expected");
            System.exit(1);
        }
        try {
            Scanner in = new Scanner(new File(args[0]));
            int total = 0;
            while (in.hasNextLine()){
                String line = in.nextLine();
                if (line.contains(args[1])){
                    total++;
                }
            }
            if (total != 0){
                System.out.println(args[1] + " appears " + total + " number of times");
            } else {
                System.out.println(args[1] + " does not appear in the list");
            }
        }
        catch (IOException e){
            System.err.println(e);
        }
    }
}
