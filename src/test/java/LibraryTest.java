import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LibraryTest {

    Book book1;
    Library library;

    @Before
    public void setup(){
        book1 = new Book("Life and Fate", "Vassily Grossman", "Literary");
        library = new Library(30);
    }

    @Test
    public void canCountBooks(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void cantAddBookBeyondCapacity(){
        for(int i=0; i<30; i++){
            library.addBook(book1);
        }
        assertEquals(30, library.bookCount());
        library.addBook(book1);
        assertEquals(30, library.bookCount());
    }

    @Test
    public void genreCountInLibrary(){
        assertEquals(0, library.genreCount("Literary"));
        library.addBook(book1);
        assertEquals(1, library.genreCount("Literary"));
        library.removeBook(book1);
        assertEquals(0, library.genreCount("Literary"));
    }
}
