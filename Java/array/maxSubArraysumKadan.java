public class maxSubArraysumKadan {
    public static void maxSum(int numbers[]) {
        int ms = Integer.MIN_VALUE; // maximum sum
        int cs = numbers[0]; // current sum

        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if (cs < numbers[i]) {
                cs = numbers[i];
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("max sub array sum is: " + ms);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        maxSum(numbers);
        int numbers1[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        maxSum(numbers1);
        int numbers2[] = { -1, -2, -3, -4, -5, -6 };
        maxSum(numbers2);
    }
}
