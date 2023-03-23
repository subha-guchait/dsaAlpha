package recursion;

public class tilingProblem {
    public static int ways(int n) {
        if (n == 0 || n == 1)
            return 1;
        // work
        // vertical choice
        int fnm1 = ways(n - 1);

        // horizontal choice
        int fnm2 = ways(n - 2);

        return fnm1 + fnm2;
    }

    public static void main(String[] args) {
        System.out.println(ways(4));
    }
}
