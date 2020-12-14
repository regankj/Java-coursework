import java.util.*;

public class ForEach 
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
        for (String item: printQ)
        {
            if (item.endsWith(".doc"))
                System.out.println(item);
        }
    }
}
