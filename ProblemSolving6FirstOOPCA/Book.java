package ProblemSolving6FirstOOPCA;

import javax.swing.*;
import java.util.Arrays;

public class Book {
    private String ISBN;
    private String title;
    private  String publisher;
    private Author[] authors;
    private int numberCopies;

    public Book(String ISBN,String title,String publisher,Author[] authors,int numberCopies) {
        setISBN(ISBN);
        setTitle(title);
        setPublisher(publisher);
        setAuthors(authors);
        setNumberCopies(numberCopies);
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public int getNumberCopies() {
        return numberCopies;
    }

    public void setNumberCopies(int numberCopies) {
        if (numberCopies<0)
            JOptionPane.showMessageDialog(null,"Number of copies must be positive","Bad Input"
                    ,JOptionPane.ERROR_MESSAGE);
        else
            this.numberCopies = numberCopies;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "ISBN: " + getISBN() + " Title: " + getTitle() + " Publisher: " + getPublisher() + " Author(s): " + Arrays.toString(getAuthors()) ;
    }
}
