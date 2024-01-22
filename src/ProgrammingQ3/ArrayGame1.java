package ProgrammingQ3;

public class ArrayGame1 {

    public static boolean canWinGame(int leap, int[] game) {
        int n = game.length;
        return canReachEnd(0, leap, game, n);
    }

    private static boolean canReachEnd(int currentIndex, int leap, int[] game, int n) {
        // Check if we have reached the end of the array
        if (currentIndex >= n) {
            return true;
        }

        // Check if the current cell is not 0 or has been visited before
        if (game[currentIndex] != 0) {
            return false;
        }

        // Mark the current cell as visited
        game[currentIndex] = 1;

        // Check the possible moves: backward, forward, and leap
        if (canReachEnd(currentIndex - 1, leap, game, n)
                || canReachEnd(currentIndex + 1, leap, game, n)
                || canReachEnd(currentIndex + leap, leap, game, n)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int leapValue = 2;
        int[] gameArray = {0, 0, 1, 1, 1, 0};

        boolean result = canWinGame(leapValue, gameArray);
        System.out.println(result);
    }
}