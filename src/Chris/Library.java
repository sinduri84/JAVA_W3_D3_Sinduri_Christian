package Chris;

import java.util.HashMap;

public class Library {
    private final HashMap<String, Book> library = new HashMap<>();

    void add(Book book) {
        library.put(book.getBookUID(), book);
    }

    boolean isValid(String bookUID) {
        return library.containsKey(bookUID);
    }

    Book getBook(String bookUID) {
        return library.get(bookUID);
    }

    boolean isAvailable(String bookUID) {
        if (isValid(bookUID)) {
            return library.get(bookUID).isAvailable();
        } else {
            return false;
        }
    }
    boolean rent(String bookUID) {
        if (isValid(bookUID)) {
            if (isAvailable(bookUID)) {
                library.get(bookUID).setAvailable(false);
                System.out.println("You rented:\n" + getBook(bookUID) + "\n");
                return true;
            } else {
                System.out.println("Sorry\n" + getBook(bookUID) + "\nis rented.\n");
                return false;
            }
        } else {
            System.out.println("Book not found.\n");
            return false;
        }
    }

    void bookReturn(String bookUID) {
        library.get(bookUID).setAvailable(true);
        System.out.println("Returned "+ getBook(bookUID));
    }
}
