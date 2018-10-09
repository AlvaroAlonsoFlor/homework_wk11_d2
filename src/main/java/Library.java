import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private int capacity;

    Library(ArrayList<Book> books, int capacity) {
        this.books = books;
        this.capacity = capacity;
    }

    public int countBooks() {
        return this.books.size();
    }

    public Book addBook(Book book) {
        if (countBooks() < capacity) {
            this.books.add(book);
            return book;
        }

        return null;

    }


    public Book lendBook(Book book, Borrower borrower) {
        if (this.books.contains(book)) {
            borrower.takeBook(book);
            this.books.remove(book);
            return book;
        }

        return null;
    }
}
