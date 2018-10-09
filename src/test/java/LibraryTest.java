import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class LibraryTest {

    Book book1;
    Book book2;
    ArrayList<Book> books;
    Library library;

    @Before
    public void before() {
        book1 = new Book("Foundation", "Isaac Asimov", "sci-fi");
        book2 = new Book("Hamlet", "William Shakespeare", "tragedy");
        books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        library = new Library(books, 3);
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
}
