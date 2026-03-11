package k_mapandhashmap;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // 1. Map <Key, Value> (stored data, NOT in order)
        Map<String, Integer> map = new HashMap<>();

        map.put("Raymond", 123456);
        map.put("Jason", 654321);
        map.put("Sammie", 567890);
        map.put("Theresa", 987654);

        // 2. Using the HashMap forEach method to iterate through its data
        map.forEach((key, value)->{
            String formatted = String.format("Username: %s, Issued Key: %d", key, value);
            System.out.println(formatted);
        });

        System.out.println("\n");

        // 3. Iterate HashMap using a while loop
        Set set = map.entrySet();
        Iterator iterator = set.iterator();

        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry)iterator.next();
            String formatted = String.format("Username: %s, Issued Key: %d", entry.getKey(), entry.getValue());
            System.out.println(formatted);
        }

        System.out.println("\n");

        // 4. Iterate HashMap using conventional for-each
        for (Map.Entry<String, Integer> entry: map.entrySet()){
            String formatted = String.format("Username %s, Issued Key: %d", entry.getKey(), entry.getValue());
            System.out.println(formatted);
        }

    }
}
