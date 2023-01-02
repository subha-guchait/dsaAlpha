public class factorial {
    public static long calculateFactorial(long n) {
        long f = 1;
        for (long i = n; i > 1; i--) {
            f = f * i;
        }
        return f;
    }

    public static void main(String args[]) {
        System.out.println(calculateFactorial(5));
    }

}
