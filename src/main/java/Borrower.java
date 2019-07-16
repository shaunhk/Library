import java.util.ArrayList;

public class Borrower {

    ArrayList<Book> books;

    public Borrower(){
        this.books = new ArrayList<Book>();
    }

    public int bookCount() {
        return this.books.size();
    }

    public void borrowBook(Library library, Book book) {
        library.removeBook(book);
        this.books.add(book);
    }

    public void returnBook(Library library, Book book) {
        library.addBook(book);
        this.books.remove(book);
    }
}
