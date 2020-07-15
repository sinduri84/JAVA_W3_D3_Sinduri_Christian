package Sinduri.A1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> actors = new HashMap<String, String>();

        actors.put("Hulk", "Mark Ruffalo");
        actors.put("Captain America", "Chris Evans");
        actors.put("Thor", "Chris Hemsworth");
        actors.put("Iron Man", "Robert Downey Jr");
        actors.put("Black Widow", "Scarlett Johansson");
        actors.put("Loki", "Tom Hiddleston");

        //Uses forEach to print keys and values
        actors.forEach((key, value) -> System.out.println("\"" + value + "\" played \"" + key + "\" in the Avengers movies!"));

        //Retrieves a value with a given key.
        System.out.println("\nWho played Hulk? " + actors.get("Hulk"));

        //Checks whether a key/value exists in actors HashMap
        System.out.println("\nDoes the Hashmap heroes have Hawkeye? " +
                (actors.containsKey("Hawkeye") ? "Yes" : "No"));
        System.out.println("\nDoes the Hashmap heroes have Hulk? " +
                (actors.containsKey("Hulk") ? "Yes" : "No"));
        System.out.println("\nDoes the Hashmap actors have Jeremy Renner? " +
                (actors.containsValue("Jeremy Renner") ? "Yes" : "No"));
        System.out.println("\nDoes the Hashmap actors have Mark Ruffalo? " +
                (actors.containsValue("Mark Ruffalo") ? "Yes" : "No"));

        //Finds the number of key-value mappings in the Hashmap
        System.out.println("\nThe size of the actors Hashmap is " + actors.size() + ".\n");

        //Iterates through all key-value pairs to print them
        Iterator iterate = actors.entrySet().iterator();

        while(iterate.hasNext()) {
            Map.Entry pair = (Map.Entry)iterate.next();
            System.out.println("\"" + pair.getValue() + "\" played \"" + pair.getKey() + "\" in the Avengers movies!");

        }

        //Replaces a value associated with a given key
        System.out.println("\nOld Hashmap: " + actors.toString());
        actors.replace("Hulk", "Bruce Banner");
        System.out.println("\nNew Hashmap: " + actors.toString());

        //Replaces a value if and only if it is currently mapped to a given value;
        System.out.println("\nOld Value for Hulk: " + actors.get("Hulk"));
        actors.replace("Hulk", "Bruce", "Mark Ruffalo");
        System.out.println("\nNew Value for Hulk: " + actors.get("Hulk"));
        actors.replace("Hulk", "Bruce Banner", "Mark Ruffalo");
        System.out.println("\nNew Value for Hulk: " + actors.get("Hulk"));

        //Remove a key-value pair
        System.out.println("\nOld Hashmap: " + actors.toString() + "\nOld Size: " + actors.size());
        //Refers to the key
        actors.remove("Loki");
        System.out.println("\nNew Hashmap: " + actors.toString() + "\nNew Size: " + actors.size());

        //Remove all pairs
        System.out.println("\nOld Hashmap: " + actors.toString() + "\nOld Size: " + actors.size());
        //Refers to the key
        actors.clear();
        System.out.println("\nNew Hashmap: " + actors.toString() + "\nNew Size: " + actors.size());





    }




}
