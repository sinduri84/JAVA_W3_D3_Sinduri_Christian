package Chris;

public class Book {
    private String author, title, publisher;
    final private String bookUID;
    private int year, edition;
    boolean available = true;

    public Book (String bookUID, String author, String title, String publisher, int edition, int year) {
        this.bookUID = bookUID;
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.edition = edition;
        this.year = year;
    }

    public String getBookUID() {
        return bookUID;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "\n" + title + "\nby " + author + "\n" + publisher + ", " + edition + ". Edition, " + year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public boolean isAvailable() {
        return available;
    }

}
