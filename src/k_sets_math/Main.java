package k_sets_math;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        // Union, Intersect and Difference
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        // Declare 2 arrays to populate setA and setB
        Integer[] arrA = new Integer[]{1, 2, 3};
        Integer[] arrB = new Integer[]{3, 4, 5};

        setA.addAll(Arrays.asList(arrA));                           // [1, 2, 3]
        setB.addAll(Arrays.asList(arrB));                           // [3, 4, 5]

        // Method add(): Unionising Data
        // Sets DO NOT ALLOW duplicates
        Set<Integer> unionData = new HashSet<>(setA);               // [1, 2, 3]
        unionData.addAll(setB);
        System.out.println("Union Data: " + unionData);             // [1, 2, 3, 4, 5]

        // Method retainAll(): Intersect Data
        Set<Integer> intersectData = new HashSet<>(setA);           // [1, 2, 3]
        intersectData.retainAll(setB);
        System.out.println("Intersected Data: " + intersectData);   // [3]

        // Method removeAll(): Obtain the Difference between setA and setB
        Set<Integer> differenceData = new HashSet<>(setA);          // [1, 2, 3]
        differenceData.removeAll(setB);
        System.out.println("Difference:" + differenceData);         // [1, 2]

    }
}
