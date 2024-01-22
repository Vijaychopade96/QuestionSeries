package ProgrammingQ4;


import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> studentScores = new HashMap<>();

        // Adding key-value pairs to the HashMap
        studentScores.put("Alice", 90);
        studentScores.put("Bob", 85);
        studentScores.put("Charlie", 92);
        studentScores.put("David", 78);

        // Accessing values using keys
        System.out.println("Bob's score: " + studentScores.get("Bob"));

        // Iterating over the entries in the HashMap
        System.out.println("Student scores:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Checking if a key is present
        String studentName = "Charlie";
        if (studentScores.containsKey(studentName)) {
            System.out.println(studentName + "'s score: " + studentScores.get(studentName));
        } else {
            System.out.println(studentName + " not found in the HashMap.");
        }

        // Removing a key-value pair
        String studentToRemove = "David";
        if (studentScores.containsKey(studentToRemove)) {
            studentScores.remove(studentToRemove);
            System.out.println(studentToRemove + "'s score removed.");
        } else {
            System.out.println(studentToRemove + " not found in the HashMap.");
        }

        // Size of the HashMap
        System.out.println("Number of students in the HashMap: " + studentScores.size());
    }
}

