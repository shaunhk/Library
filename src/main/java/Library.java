import com.sun.xml.internal.rngom.ast.builder.Include;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    ArrayList<Book> books;
    HashMap<String, Integer> genres;
    private int capacity;

    public Library(int capacity){
        this.books = new ArrayList<Book>();
        this.genres = new HashMap<String, Integer>();
        this.capacity = capacity;
    }

    public int bookCount() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if(!atCapacity()) {
            this.books.add(book);
            if (this.genres.containsKey(book.getGenre())) {
                int newValue = this.genres.get(book.getGenre());
                this.genres.remove(book.getGenre());
                this.genres.put(book.getGenre(), newValue);
            }else{
                this.genres.put(book.getGenre(), 1);
            }
        }
    }

    private boolean atCapacity() {
        if(bookCount() == this.capacity){
            return true;
        }else{
            return false;
        }
    }

    public void removeBook(Book book) {
        this.books.remove(book);
        int newValue = this.genres.get(book.getGenre()) - 1;
        this.genres.remove(book.getGenre());
        this.genres.put(book.getGenre(), newValue);
    }

    public int genreCount(String genre) {
        if (this.genres.containsKey(genre)) {
            return this.genres.get(genre);
        }else{
            return 0;
        }
    }
}
