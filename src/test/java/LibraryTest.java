import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class LibraryTest {

    private Book book1;
    private Book book2;
    private ArrayList<Book> books;
    private Library library;
    private Borrower borrower;

    @Before
    public void before() {
        book1 = new Book("Foundation", "Isaac Asimov", "sci-fi");
        book2 = new Book("Hamlet", "William Shakespeare", "tragedy");
        books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        library = new Library(books, 3);
        borrower = new Borrower();
    }

    @Test
    public void countBooks() {
        assertEquals(2, library.countBooks());
    }

    @Test
    public void addBook() {
        library.addBook(book1);
        assertEquals(3, library.countBooks());
    }

    @Test
    public void addBookNoSpace() {
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(3, library.countBooks());
    }

    @Test
    public void lendBook() {
        library.lendBook(book1, borrower);
        assertEquals(1, library.countBooks());
        assertEquals(1, borrower.countBooks());
    }

}
