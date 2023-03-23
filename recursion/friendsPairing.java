package recursion;

public class friendsPairing {
    public static int friendsPair(int n) {
        // base case
        if (n == 1 || n == 2)
            return n;

        // choices
        // single
        int fnm1 = friendsPair(n - 1);

        // pair
        int fnm2 = friendsPair(n - 2);
        int pairWays = (n - 1) * fnm2;

        // total ways
        int totWays = fnm1 + pairWays;
        return totWays;
    }

    public static void main(String[] args) {
        System.out.println(friendsPair(10));
        System.out.println(friendsPair(3));
    }
}
