package Lesson7_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestBook {
    static List<Book> bookList = new ArrayList<>();
    public static void main(String[] args) {
        boolean isContinuing = true;
        while(isContinuing){
            System.out.println("=======MENU=========");
            System.out.println("1. Add book");
            System.out.println("2. Retrieve book(ISBN)");
            System.out.println("0. Exit!");

            Scanner scanner = new Scanner(System.in);
            int userOption = scanner.nextInt();
            switch (userOption){
                case 0:
                    System.out.println("Bye!");
                    isContinuing = false;
                    break;
                case 1:
                    addBook();
                    break;
                case 2:
                    retrieveBook();
                    break;
                }
            }

        }
        private static void addBook() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Book ISBN: ");
            String ISBN = scanner.nextLine();
            System.out.print("Book title: ");
            String bookTitle = scanner.nextLine();
            System.out.print("Book's author name: ");
            String authorName = scanner.nextLine();
            Book book = new Book(ISBN, bookTitle, authorName);
            bookList.add(book);
        }

        private static void retrieveBook() {
            Scanner scanner = new Scanner(System.in);
            int count = 0;
            if(bookList.isEmpty()){
                System.out.println("No book available");
            }else {
                System.out.printf("Enter Key to Search: ");
                String searchKey = scanner.nextLine();
                for(Book book:bookList){
                    if(book.getBookName().contains(searchKey)||book.getAuthor().contains(searchKey)){
                        count++;
                    }
                }
            }
            System.out.println("Have " + count +" book you're looking for!");

        }
}
