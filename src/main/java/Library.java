import java.util.ArrayList;

public class Library {
    ArrayList<Book> books;
    int capacity;

    Library(ArrayList<Book> books, int capacity) {
        this.books = books;
        this.capacity = capacity;
    }

    public int countBooks() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if (countBooks() < capacity) {
            this.books.add(book);
        }

    }
}
