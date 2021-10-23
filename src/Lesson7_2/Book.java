package Lesson7_2;

public class Book {
    private String ISBN;
    private String bookName;
    private String author;

    public Book() {
    }

    public Book(String ISBN, String bookName, String author) {
        this.ISBN = ISBN;
        this.bookName = bookName;
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
