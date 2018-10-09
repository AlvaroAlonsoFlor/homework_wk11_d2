import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> books;

    Borrower() {
        this.books = new ArrayList<>();
    }

    public int countBooks() {
        return this.books.size();
    }

    public void takeBook(Book book) {
        this.books.add(book);
    }
}
