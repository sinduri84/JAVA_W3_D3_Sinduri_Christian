package Chris;

public class LibraryDemo {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.add(new Book("b1","H. Mössenböck", "Sprechen Sie Java? Eine Einführung in das systematische Programmieren", "dpunkt.verlag", 5, 2014));
        lib.add(new Book("b2","R. Schiedermeier", "Programmieren mit Java", "Pearson Studium", 2, 2010));
        lib.add(new Book("b3","R. C. Martin", "Clean Code - Refactoring, Patterns, Testen und Techniken für sauberen Code", "mitp", 1, 2009));
        lib.add(new Book("b4","R. Sedgewick, K. Wayne", "Computer Science: An Interdisciplinary Approach", "Addison Wesley", 1, 2016));
        lib.add(new Book("b5","R. Sedgewick, K. Wayne", "Algorithms", "Addison Wesley", 4, 2011));
        LibraryUser lu = new LibraryUser(lib);
        lu.rent("b1");
        lu.rent("b1");
        lu.rent("b3");
        lu.rent("b5");
        System.out.println(lu);
    }
}
