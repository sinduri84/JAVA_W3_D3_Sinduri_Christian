package Chris;

import java.util.HashMap;

public class PhoneBook {
    HashMap<String, Integer> phoneBook = new HashMap<>();

    void add(String name, int phone) {
        phoneBook.put(name, phone);
    }

    void delete(String name) {
        phoneBook.remove(name);
    }

    void show(String name) {
        boolean match = false;
        String msg = "";
        for (String contact : phoneBook.keySet()) {
            if (contact.toLowerCase().contains(name)) {
                msg += contact + ": " + phoneBook.get(contact) + "\n";
                match = true;
            }
        }
        if (!match) {
            msg = "Sorry couldn't find anyting containing " + name;
        }
        String border = "===========================\n";
        System.out.println("Search Results for: " + name + "\n" + border + msg + border);
    }

    void showAll() {
        String msg = "";
        for (String contact : phoneBook.keySet()) {
            msg += contact + ": " + phoneBook.get(contact) + "\n";
        }
        System.out.println(msg);
    }
}
