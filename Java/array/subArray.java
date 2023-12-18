import java.util.*;
//print sub arrays

public class subArray {
        public static void printSubarrays(int numbers[]) {
                int ts = 0; // total sub array
                for (int i = 0; i < numbers.length; i++) {
                        // start = i
                        for (int j = i; j < numbers.length; j++) {
                                // end = i
                                for (int k = i; k <= j; k++) {
                                        // for print
                                        System.out.print(numbers[k] + " ");
                                }
                                ts++;
                                System.out.println();
                        }
                        System.out.println();
                }
                System.out.println(ts);
        }

        public static void main(String[] args) {
                int numbers[] = { 2, 4, 6, 8, 10 };
                printSubarrays(numbers);
        }
}
