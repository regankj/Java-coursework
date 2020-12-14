import java.io.*;
import java.util.ArrayList;

public class BookLibrary {
    private ArrayList<BookRecord> books;
    public BookLibrary(){
        books = new ArrayList<BookRecord>();
    }
    public void readRecords(){
        try {
            ObjectInputStream stream = new ObjectInputStream(new FileInputStream("books.dat"));
            books = (ArrayList<BookRecord>)stream.readObject();
            stream.close();
        }
        catch(Exception ioe){

        }
    }
    public void writeRecords(){
        try {
            ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("book.data"));
            stream.writeObject(books);
            stream.close();
        }
        catch(IOException ioe){
            System.err.println("Book records cannot be saved.");
        }
    }
    private int locateBook(int book_id){
        for (int i=0; i < books.size(); i++)
            if (books.get(i).getNumber() == book_id){
                return i;
            }
        return -1;
    }
    public void addBook(BookRecord rec){
        int idx = locateBook(rec.getNumber());
        if (idx >= 0){
            System.out.println("Book with ID " + rec.getNumber() + "already exists. Record not added.");
        }
        else {
            books.add(rec);
            System.out.println("Book with ID" + rec.getNumber() + " successfully added.");
        }
    }
    public BookRecord getBook(int book_id){
        int idx = locateBook(book_id);
        if (idx >= 0)
            return books.get(idx);
        else
            return null;
    }
    public void deleteBook(int book_id){
        int idx = locateBook(book_id);
        if (idx >= 0){
            books.remove(idx);
            System.out.println("Book with ID " + book_id + " successfully removed.");
        }
        else {
            System.out.println("Book with ID " + book_id + " does not exist.");
        }
    }
}
