package Chris;

import Chris.library.Rent;

import java.util.ArrayList;

public class LibraryUser {
    private final ArrayList<Rent> rented = new ArrayList<>();
    Library library;
    LibraryUser(Library library) {
        this.library = library;
    }
    void rent(String bookUID) {
        if (library.rent(bookUID)) {
            rented.add(new Rent(library.getBook(bookUID)));
        }
    }

    @Override
    public String toString() {
        String list = "";
        for (Rent rent : rented) {
            list += "\n" + rent.toString();
        }
        return "Rented Books: " + list;
    }
}
