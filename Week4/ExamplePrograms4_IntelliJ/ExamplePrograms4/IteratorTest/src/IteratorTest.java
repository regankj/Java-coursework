import java.util.*;

public class IteratorTest 
{
    // Simulating printer queue
    public static void main(String[] args) 
    {
        ArrayList<String> printQ = new ArrayList<String>();
        printQ.add("myLetter.doc");
        printQ.add("myPhoto.jpg");
        printQ.add("results.xls");
        printQ.add("memo.doc");
        
        // find all the .doc files
        Iterator<String> files = printQ.iterator();
        while (files.hasNext())
        {
            String filename = files.next(); // gets the next file
            if (filename.endsWith(".doc"))
                System.out.println(filename);
        }
    }
}
