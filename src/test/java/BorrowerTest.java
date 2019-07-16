import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Book book;

    @Before
    public void setup(){
        borrower = new Borrower();
        book = new Book("Trainspotting", "Irvine Welsh", "Modern Classic");
        library = new Library(30);
    }

    @Test
    public void canCountBooks(){
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void canBorrowBook(){
        library.addBook(book);
        borrower.borrowBook(library, book);
        assertEquals(0, library.bookCount());
        assertEquals(1, borrower.bookCount());
    }

    @Test
    public void canReturnBook(){
        library.addBook(book);
        borrower.borrowBook(library, book);
        borrower.returnBook(library, book);
        assertEquals(1, library.bookCount());
        assertEquals(0, borrower.bookCount());
    }

}
