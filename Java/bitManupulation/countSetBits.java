public class countSetBits {
    public static int setBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) { // check our lsb
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(setBits(10));
        System.out.println(setBits(15));
        System.out.println(setBits(16));
    }
}
