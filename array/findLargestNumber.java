import java.util.*;

//find the largest number

public class findLargestNumber {
    public static int getlargest(int number[]) {
        int largestNumber = Integer.MIN_VALUE;
        // for smallest number smallestNumber = Integer.Max_value;
        for (int i = 0; i < number.length; i++) {
            if (largestNumber < number[i]) {
                largestNumber = number[i];
            }
            // for smallest number
            // if (smallestNumber > number[i]) {
            // smallestNumber = number[i];
            // }
        }
        return largestNumber;
    }

    public static void main(String[] args) {
        int number[] = { 2, 3, 334, 67, 4, 46 };
        System.out.println(getlargest(number));
    }
}