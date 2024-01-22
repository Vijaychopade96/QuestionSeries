package ProgrammingQ3;

import java.util.Scanner;

public class ArrayGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt(); // number of queries

        while (q-- > 0) {
            int n = scanner.nextInt(); // array size
            int leap = scanner.nextInt(); // leap value

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scanner.nextInt();
            }

            System.out.println(canWinGame(n, leap, game) ? "YES" : "NO");
        }

        scanner.close();
    }

    private static boolean canWinGame(int n, int leap, int[] game) {
        return canWinRecursive(0, n, leap, game);
    }

    private static boolean canWinRecursive(int i, int n, int leap, int[] game) {
        // Base cases
        if (i < 0 || game[i] == 1) {
            return false; // Cell is blocked or out of bounds
        }
        if (i == n - 1 || i + leap >= n) {
            return true; // Reached the end of the array
        }

        // Mark the current cell as visited
        game[i] = 1;

        // Recursive cases
        return canWinRecursive(i + 1, n, leap, game) ||
                canWinRecursive(i - 1, n, leap, game) ||
                canWinRecursive(i + leap, n, leap, game);
    }
}

