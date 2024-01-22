package ProgrammingQ3;

import java.util.Arrays;

public class Q8MinAndMax {
    public static void main(String[] args) {
        int[] array = {10, 5, 8, 20, 15};

        int maxValue = Arrays.stream(array).max().orElseThrow();
        int minValue = Arrays.stream(array).min().orElseThrow();

        System.out.println("The maximum value in the array is: " + maxValue);
        System.out.println("The minimum value in the array is: " + minValue);
    }
}
