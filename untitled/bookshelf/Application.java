package bookshelf;
import bookshelf.books.Author;
import bookshelf.books.Book;
import bookshelf.books.Shelf;

import java.util.Set;

public class Application {
    public static void main(String[] args) {

        Shelf Shelf1 = new Shelf(2, "голубой");
        Author author1 = new Author("Tom", "Thompson");
        Author author2 = new Author("John", "Johnson");

        System.out.println(author1);

        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        System.out.println(book1);
        book1.setPageCount(22);
        System.out.println(book1.getPageCount());
        book1.setAuthor(author1);
        Shelf1.addBook(book1);

        Shelf1.addBook(book2);
    }}
