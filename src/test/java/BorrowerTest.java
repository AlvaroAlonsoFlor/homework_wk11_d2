import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class BorrowerTest {
    Library library;
    Borrower borrower;

    @Before
    public void before() {
        Book book1 = new Book("Foundation", "Isaac Asimov", "sci-fi");
        library = new Library(new ArrayList<>(), 3);
        library.addBook(book1);
    }

    @Test
    public void takeBook() {
        //take 1 book from library
        //add the book to borrower
        assertEquals();
    }
}
