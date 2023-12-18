package backtracking;

public class gridWaysProblem {
    public static int gridWays(int i, int j, int n, int m) {
        // base case
        if (i == n - 1 && j == m - 1) { // condition for last cell
            return 1;
        } else if (i == n || j == m) { // condition for boundary cross
            return 0;
        }

        int w1 = gridWays(i + 1, j, n, m);
        int w2 = gridWays(i, j + 1, n, m);
        return w1 + w2;
    }

    // optimized soln of grid ways problem using permutation
    public static int gridWaysOptimized(int n, int m) {
        int ways = (factorial(n - 1 + m - 1)) / (factorial(n - 1) * factorial(m - 1));
        return ways;
    }

    public static int factorial(int a) {
        if (a == 0 || a == 1) {
            return 1;
        }
        return a * factorial(a - 1);
    }

    public static void main(String[] args) {
        System.out.println(gridWays(0, 0, 4, 3));
        System.out.println(gridWaysOptimized(4, 4));

    }
}
