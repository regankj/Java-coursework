import java.io.*;
import java.util.ArrayList;

public class Books {
    public static void main(String[] args){
        BookLibrary library = new BookLibrary();
        if (args.length < 2){
            System.out.println("Wrong command line input");
            System.exit(1);
        }
        library.readRecord();

        if (args[0].equalsIgnoreCase("add")){
            if (args.length != 5){
                System.out.println("Wrong command line input");
                System.exit(3);
            }
            BookRecord newRecord = new BookRecord();
            newRecord.setNumber(Integer.parseInt(args[1]));
            newRecord.setTitle(args[2]);
            newRecord.setAuthors(args[3]);
            newRecord.setYear(Integer.parseInt(args[4]));

            library.addBook(newRecord);
        }
        else if (args[0].equalsIgnoreCase("query")){
            int book_id = Integer.parseInt(args[1]);
            BookRecord oldRecord = library.getBook(book_id);
            if (oldRecord != null){
                System.out.println("Book ID: " + oldRecord.getNumber());
                System.out.println("Title: " + oldRecord.getTitle().trim());
                System.out.println("Authors: " + oldRecord.getAuthors().trim());
                System.out.println("Year: " + oldRecord.get());
            }
            else {
                System.out.println("Record does not exist");
            }
        }
        else if (args[0].equalsIgnoreCase("delete")){
            int book_id = Integer.parseInt(args[1]);
            library.deleteBook(book_id);
        }
        else {
            System.out.println("Unknown command, only add/query/delete are supported.");
            System.exit(2);
        }
        library.writeRecords();
    }
}
