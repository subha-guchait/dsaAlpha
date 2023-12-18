public class fastExpo {
    public static int fastEx(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans *= a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fastEx(2, 5));
        System.out.println(fastEx(2, 10));
        System.out.println(fastEx(5, 25));

    }
}