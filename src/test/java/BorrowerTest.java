import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class BorrowerTest {
    private Library library;
    private Borrower borrower;
    private Book book1;

    @Before
    public void before() {
        book1 = new Book("Foundation", "Isaac Asimov", "sci-fi");
        library = new Library(new ArrayList<>(), 3);
        library.addBook(book1);
        borrower = new Borrower();
    }

    @Test
    public void takeBook() {
        borrower.takeBook(book1);
        assertEquals(1, borrower.countBooks());
    }
}
