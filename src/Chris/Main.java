package Chris;

public class Main {


    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        pb.add("Joannes", 393738769);
        pb.add("Devy", 631843699);
        pb.add("Sharleen", 909861078);
        pb.add("Chlo", 614171782);
        pb.add("Natala", 936784592);
        pb.add("Brendan", 165143733);
        pb.add("Betteann", 124437972);
        pb.add("Leoline", 787511305);
        pb.add("Chandal", 857183786);
        pb.add("Margery", 425159253);
        pb.showAll();
        pb.show("ch");
        pb.show("a");
        pb.delete("Margery");
        pb.showAll();
    }
}
