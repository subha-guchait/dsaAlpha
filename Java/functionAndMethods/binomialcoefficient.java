public class binomialcoefficient {
    public static long calculateFactorial(long n) {
        long f = 1;
        for (long i = n; i > 1; i--) {
            f = f * i;
        }
        return f;
    }

    public static long bincoeff(long n, long r) {
        long fact_n = calculateFactorial(n);
        long fact_r = calculateFactorial(r);
        long fact_nmr = calculateFactorial(n - r);
        long bincoeff = fact_n / (fact_r * fact_nmr);
        return bincoeff;
    }

    public static void main(String[] args) {
        System.out.println(bincoeff(5, 2));
    }

}
