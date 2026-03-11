package k_setandhashset;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // 1. Create a Hashset using a Set Interface
        Set<String> data = new HashSet<>();

        // 2. Use add() method of a Set to populate our data
        data.add("HTML");
        data.add("CSS");
        data.add("JavaScript");
        data.add("Java");
        data.add("JavaScript");             // this data is ignored (Sets disallows duplicates)

        System.out.println(data);
        System.out.println(data.size());    // size is 4, NOT in order of insertion [Java, CSS, JavaScript, HTML]

        System.out.println("The language Java is covered: " + data.contains("Java"));

        // 3. Since a HashSet is NOT sorted, how can it be sorted then?
        // Use sort() method of a List to sort the data
        List<String> sortedData = new ArrayList<>(data);

        Collections.sort(sortedData);                   // sort in ascending order [CSS, HTML, Java, JavaScript]
        System.out.println(sortedData);

        sortedData.sort(Collections.reverseOrder());    // sort in descending order
        System.out.println(sortedData);
    }
}
