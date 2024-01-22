package ProgrammingQ1.Q2;

import java.util.HashMap;
import java.util.Map;

public class CountUniqueValues {

    public static void main(String[] args) {
        int[] A = {1, 1, 1, 2, 2, 3, 3, 3};

        // Use a Map to store the count of each unique value
        Map<Integer, Integer> countMap = new HashMap<>();

        // Populate the countMap
        for (int value : A) {
            countMap.put(value, countMap.getOrDefault(value, 0) + 1);
        }

        // Print the result
        System.out.print("[");
        countMap.forEach((key, value) -> System.out.print(key + " x " + value + ", "));
        System.out.println("]");
    }
}

