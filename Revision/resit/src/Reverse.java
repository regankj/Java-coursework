import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class Reverse {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input file: ");
        String inFile = scanner.nextLine();
        System.out.println("Enter the output file: ");
        String outFile = scanner.nextLine();
        Stack myStack = null;

        try {
            Scanner in = new Scanner(new File(inFile));
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(outFile));
            while(in.hasNextLine()){
                StringBuffer rev = new StringBuffer(in.nextLine()).reverse();
                myStack.push(rev);
            }
            for (int i = 0; i< myStack.size(); i++){
                out.writeObject(myStack.pop());
            }
        }
        catch (IOException e){
            System.err.println(e);
        }
    }
}
