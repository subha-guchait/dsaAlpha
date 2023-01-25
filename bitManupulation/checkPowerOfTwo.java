public class checkPowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(5));
        System.out.println(isPowerOfTwo(0));
        System.out.println(isPowerOfTwo(12));
        System.out.println(isPowerOfTwo(105));
    }
}
