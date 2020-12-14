import java.util.*;

public class ListTest 
{
    // Simulating printer queue
    public static void main(String[] args) 
    {
        ArrayList<String> printQ = new ArrayList<String>();
        printQ.add("myLetter.doc");
        printQ.add("myPhoto.jpg");
        printQ.add("results.xls");
        System.out.println(printQ);
        
        printQ.add(0, "importantMemo.doc"); // inserts into the front
        System.out.println(printQ);
        
        printQ.set(3, "newChapter.doc");    // sets an item
        System.out.println(printQ);
        
        printQ.remove(2);                   // removes an item
        System.out.println(printQ);
        
        System.out.println("Item at index 1: " + printQ.get(1));
    }
}
