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
        Dictionary dict = new Dictionary();
        dict.add("Turtle, eastern box", "Terrapene carolina", "donec dapibus duis at velit eu est congue elementum in hac habitasse platea dictumst morbi vestibulum velit id\n");
        dict.add("Peccary, collared", "Tayassu tajacu", "justo sit amet sapien dignissim vestibulum vestibulum ante ipsum primis\n");
        dict.add("Mule deer", "Odocoileus hemionus", "pretium iaculis diam erat fermentum justo nec condimentum neque sapien placerat ante nulla justo aliquam quis\n");
        dict.add("Stork, openbill", "Anastomus oscitans", "aliquet massa id lobortis convallis tortor risus dapibus augue vel accumsan tellus nisi eu orci mauris lacinia sapien quis libero\n");
        dict.add("Masked booby", "Sula dactylatra", "a feugiat et eros vestibulum ac est lacinia nisi venenatis tristique fusce congue diam id ornare imperdiet\n");
        dict.add("Dove, laughing", "Streptopelia senegalensis", "id sapien in sapien iaculis congue vivamus metus arcu adipiscing molestie hendrerit at vulputate vitae nisl aenean lectus pellentesque\n");
        dict.add("Cheetah", "Acinynox jubatus", "lacus at velit vivamus vel nulla eget eros elementum pellentesque quisque porta volutpat erat quisque erat eros viverra eget congue\n");
        dict.add("Northern phalarope", "Phalaropus lobatus", "erat fermentum justo nec condimentum neque sapien placerat ante nulla justo aliquam quis turpis eget elit sodales scelerisque mauris\n");
        dict.add("Red-billed hornbill", "Tockus erythrorhyncus", "sit amet sapien dignissim vestibulum vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae nulla dapibus\n");
        dict.search("ed");
        dict.delete("Turtle, eastern box");
        dict.delete("mule");
        dict.showAll();
    }
}
