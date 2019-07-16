import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BookTest {

    Book book1;

    @Before
    public void before(){
        book1 = new Book("Dune", "Frank Herbert", "Science Fiction");
    }

    @Test
    public void bookHasName(){
        assertEquals("Dune", book1.getName());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Frank Herbert", book1.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Science Fiction", book1.getGenre());
    }
}
