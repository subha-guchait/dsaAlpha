package recursion;

//calculate sum of first n natural number
public class sumNaturalNumber {
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int sn = n + sum(n - 1);
        return sn;
    }

    public static void main(String[] args) {
        System.out.println(sum(4));
    }
}
