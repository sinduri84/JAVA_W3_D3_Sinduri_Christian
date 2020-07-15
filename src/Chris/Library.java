package Chris;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> library = new ArrayList<>();
    private ArrayList<String> altLibary = new ArrayList<>();

    void add(Book book) {
        library.add(book);
    }

    boolean isAvailable(String bookUID) {
        for (Book book : library) {
            if (book.getBookUID().equals(bookUID)) {
                return book.isAvailable();
            }
        }
        return false;
    }
    boolean isAvailable(String bookUID, HashMap<String, Book> alternativeStorage) {
        for (String UID : altLibary) {
            if (UID.equals(bookUID)) {
                return alternativeStorage.get(UID).isAvailable();
            }
        }
        return false;
    }

    void rent(String bookUID) {
        for (Book book : library) {
            if (book.getBookUID().equals(bookUID)) {
                book.setAvailable(false);
            }
        }
    }
    void bookReturn(String bookUID) {
        for (Book book : library) {
            if (book.getBookUID().equals(bookUID)) {
                book.setAvailable(true);
            }
        }
    }
    void addAlt(Book book, HashMap<String, Book> alternativeStorage) {
        altLibary.add(book.getBookUID());
        alternativeStorage.put(book.getBookUID(), book);
    }

    void copyToAltStorage(HashMap<String, Book> alternativeStorage) {
        for (Book book : library) {
            addAlt(book, alternativeStorage);
        }
    }
}
