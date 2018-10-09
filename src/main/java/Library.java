import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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

    public HashMap<String, Integer> getBooksByGenre() {
        Integer counter = 1;
        HashMap<String, Integer> result = new HashMap<>();

        for (Book book: books)
            if (result.containsKey(book.getGenre())) {
                counter++;
                result.put(book.getGenre(), counter);
            } else {
                result.put(book.getGenre(), 1);
                counter = 1;
            }

        return result;
    }

    public int numberOfBooksByGenre(String genre) {
        return getBooksByGenre().get(genre);
    }
}
