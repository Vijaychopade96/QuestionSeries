package ProgrammingQ3;

public class Q7FindLargestElement {
    public static void main(String[] args) {
        int[] array = {10, 5, 8, 20, 15};

        int largestElement = findLargestElement(array);

        System.out.println("The largest element in the array is: " + largestElement);
    }

    private static int findLargestElement(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null.");
        }

        int largest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        return largest;
    }
}
