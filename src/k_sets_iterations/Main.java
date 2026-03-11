package k_sets_iterations;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>();

        String[] arrNames = new String[]{"Santiago", "Andres", "Andres Gonzales", "Emily", "Santiago"};

        names.addAll(Arrays.asList(arrNames));
        System.out.println(names);

        // 1. Adding a new set of names using a for loop
        String[] newNames = new String[]{"Jameson", "Benny", "Maggie"};

        for (int i = 0; i < newNames.length; i++) {
            names.add(newNames[i]);
        }

        // 2. Print out all the names in individual rows
        for (String name : names) {
            System.out.println(name); // Andres, Santiago, Andres Gonzales, Emily, Benny, Jameson
        }

        // 3. Find and replace a value in one of the elements in the Set
        // "Andres" to "Andres - confirmed"
        // Set/HashSet does not have get() and set() methods

        if(names.contains("Andres")){
            names.remove("Andres");
            names.add("Andres - confirmed");
        }

        System.out.println(names);

        // 4. Using Set forEach() method to iterate through the data
        // lambda expression
        names.forEach((name)->{
            System.out.println(name);
        });

        // 5. Using Set forEach() method to amend and element
        // Set Maggie's invitation as "pending"
        names.forEach(name -> {
            System.out.println(name == "Maggie" ? "Maggie - pending" : name);
        });

        // 6. If we wish to amend the element's value
        if(names.contains("Maggie")){
            names.remove("Maggie");
            names.add("Maggie - pending");
        }
    }


}
