package recursion;

public class power {
    public static int calPow(int x, int n) {
        if (n == 0)
            return 1;
        return x * calPow(x, n - 1);
    }

    // power function more optimized
    public static int opCalPow(int x, int n) {
        if (n == 0)
            return 1;
        int halfPow = opCalPow(x, n / 2);
        int halfPowSq = halfPow * halfPow;
        if (n % 2 != 0) {
            halfPowSq = x * halfPowSq;
        }
        return halfPowSq;
    }

    public static void main(String[] args) {
        System.out.println(calPow(2, 10));
        System.out.println(opCalPow(2, 5));
    }
}
