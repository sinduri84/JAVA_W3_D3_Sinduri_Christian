package Chris;

import Chris.library.Rent;

import java.util.ArrayList;
import java.util.HashMap;

public class LibraryUser {
    ArrayList<Rent> rented = new ArrayList<>();
    Library library;
    HashMap<String, Book> altLibary;
    LibraryUser(Library library, HashMap<String, Book> altLibary) {
        this.library = library;
        this.altLibary = altLibary;
    }
    void rent(String bookUID) {
        if (library.isAvailable(bookUID)) {
            rented.add(new Rent(altLibary.get(bookUID)));
            library.rent(bookUID);
        } else {
            System.out.println( "Sorry\n" +
                                "==========================\n" +
                                altLibary.get(bookUID) +
                                "\n==========================\n" +
                                "is not available" +
                                "\n==========================\n");
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
