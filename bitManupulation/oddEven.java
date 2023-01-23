public class oddEven {
    public static void oddOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("The number is even");

        } else {
            System.out.println("The number is odd");
        }
    }

    public static void main(String[] args) {
        oddOrEven(5);
        oddOrEven(7);
        oddOrEven(4);
        oddOrEven(53);
        oddOrEven(15);
    }
}
