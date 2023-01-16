// print out the sum of the numbers in the 2nd row of the "nums" array
public class printSum {
    public static int sum2nd(int nums[][]) {
        int sum = 0;
        for (int j = 0; j < nums[0].length; j++) {
            sum += nums[1][j];
        }
        return sum;
    }

    public static void main(String[] args) {
        int nums[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        System.out.println(sum2nd(nums));
    }
}
