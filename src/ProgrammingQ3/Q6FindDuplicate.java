package ProgrammingQ3;

public class Q6FindDuplicate {

    public static void main(String[] args) {


        int[] array = {1, 2, 3, 4, 5, 2, 6, 7, 8, 9, 1};

        findDuplicates(array);
    }

    private static void findDuplicates(int[] array) {
        System.out.println("Duplicate elements:");

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                }
            }
        }
    }
}
