import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before () {
        book = new Book("Foundation", "Isaac Asimov", "sci-fi");
    }

    @Test
    public void getTitle() {
        assertEquals("Foundation", book.getTitle());
    }

    @Test
    public void getAuthor() {
        assertEquals("Isaac Asimov", book.getAuthor());
    }

    @Test
    public void getGenre() {
        assertEquals("sci-fi", book.getGenre());
    }

}
