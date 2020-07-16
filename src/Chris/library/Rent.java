package Chris.library;

import Chris.Book;

import java.time.LocalDate;

public class Rent {
    Book book;
    LocalDate dueDate = LocalDate.now().plusDays(15);

    public Rent(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return book + "\nis due on : " + dueDate + "\n";
    }
}
