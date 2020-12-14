/**
 * Book Record
 * @author Yukun
 */
import java.io.*;

public class BookRecord implements Serializable
{
    // methods to get and set variables
    public void setNumber(int n) { number = n; }
    public void setTitle(String t) { title = t; }
    public void setAuthors(String a) { authors = a; }
    public void setYear(int y) { year = y; }
    
    public int getNumber() { return number; }
    public String getTitle() { return title; }
    public String getAuthors() { return authors; }
    public int getYear() { return year; }
    
    // instance variables
    private int number;
    private String title;
    private String authors;
    private int year;
}
