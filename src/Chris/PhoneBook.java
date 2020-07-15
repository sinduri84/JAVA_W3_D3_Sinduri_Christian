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
        String border = "===========================\n";
        boolean match = false;
        String output = "";
        for (String contact : phoneBook.keySet()) {
            if (contact.toLowerCase().contains(name)) {
                output += contact + ": " + phoneBook.get(contact) + "\n";
                match = true;
            }
        }
        if (!match) {
            output = border + "Sorry couldn't find anyting containing " + name + "\n" + border;
        }
        System.out.println("Search Results for: " + name + "\n" + border + output + border);
    }

    void showAll() {
        String output = "";
        for (String contact : phoneBook.keySet()) {
            output += contact + ": " + phoneBook.get(contact) + "\n";
        }
        System.out.println(output);
    }
}
