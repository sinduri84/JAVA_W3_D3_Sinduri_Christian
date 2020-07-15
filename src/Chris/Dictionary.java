package Chris;

import java.util.HashMap;

public class Dictionary {
    HashMap<String[], String> dictionary = new HashMap<>();

    void add(String word, String meaning, String description) {
        String[] wordMeaning = new String[2];
        wordMeaning[0] = word;
        wordMeaning[1] = meaning;
        dictionary.put(wordMeaning, description);
    }
    void showAll() {
        String output = "";
        for (String[] wordMeaning : dictionary.keySet()) {
            output += wordMeaning[0] + " - " + wordMeaning[1] + ":\n" + dictionary.get(wordMeaning) + "\n";
        }
        System.out.println(output);
    }

    void delete(String word) {
        boolean match = false;
        String border = "===========================\n";
        String[] toRemove = new String[0];
        for (String[] wordMeaning : dictionary.keySet()) {
            if (wordMeaning[0].equals(word)) {
                toRemove = wordMeaning;
                match = true;
            }
        }
        if (!match) {
            System.out.println(border + word + " not found. Nothing to remove.\n" + border);
        } else {
            dictionary.remove(toRemove);
            System.out.println(border + "Removing " + word + " from dictionary\n" + border);

        }
    }

    void search(String search) {
        boolean match = false;
        String output = "";
        for (String[] wordMeaning : dictionary.keySet()) {
            if (    wordMeaning[0].toLowerCase().contains(search) ||
                    wordMeaning[1].toLowerCase().contains(search) ||
                    dictionary.get(wordMeaning).toLowerCase().contains(search)) {
                output += wordMeaning[0] + " - " + wordMeaning[1] + ":\n" + dictionary.get(wordMeaning) + "\n";
                match = true;
            }
        }
        if (!match) {
            output = "Sorry couldn't find anyting containing " + search;
        }
        String border = "===========================\n";
        System.out.println("Search Results for: " + search + "\n" + border + output + border);
    }
}
