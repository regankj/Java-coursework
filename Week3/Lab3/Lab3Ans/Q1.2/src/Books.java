/**
 * Manage books using random access files
 * @author Yukun
 */
import java.io.*;
import java.util.ArrayList;

public class Books 
{
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args)
    {
        BookLibrary library = new BookLibrary();
        // parse command line input
        // for simplicity, NumberFormatException is not checked
        if (args.length < 2)
        {
            System.out.println("Wrong command line input");
            System.exit(1);
        }

        library.readRecords();

        if (args[0].equalsIgnoreCase("add")) // add a record
        {
            // add <book_id> <title> <authors> <year>
            if (args.length != 5)
            {
                System.out.println("Wrong command line input");
                System.exit(3);
            }
            // command line input
            BookRecord newRecord = new BookRecord();
            newRecord.setNumber(Integer.parseInt(args[1]));
            newRecord.setTitle(args[2]);
            newRecord.setAuthors(args[3]);
            newRecord.setYear(Integer.parseInt(args[4]));

            library.addBook(newRecord);
            //                 System.out.println("Record number " + newRecord.getNumber() + " successfully added.");
        }
        else if (args[0].equalsIgnoreCase("query")) // query
        {
            int book_id = Integer.parseInt(args[1]);
            BookRecord oldRecord = library.getBook(book_id);
            if (oldRecord != null) // record exists
            {
                System.out.println("Book ID: " + oldRecord.getNumber());
                System.out.println("Title: " + oldRecord.getTitle().trim());    // trim is used to remove unnecessary spaces
                System.out.println("Authors: " + oldRecord.getAuthors().trim());
                System.out.println("Year: " + oldRecord.getYear());
            }
            else
            {
                System.out.println("Record does not exist");
            }
        }
        else if (args[0].equalsIgnoreCase("delete")) // delete a record
        {
            int book_id = Integer.parseInt(args[1]);
            library.deleteBook(book_id);
        }
        else // wrong command
        {
            System.out.println("Unknown command, only add/query/delete are supported.");
            System.exit(2);
        }

        library.writeRecords();
    }
}
