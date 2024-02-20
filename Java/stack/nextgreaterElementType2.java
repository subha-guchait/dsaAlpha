package stack;
// Given a circular integer array nums (i.e., the next element of nums[nums.length - 1] is nums[0]), return the next greater number for every element in nums.

// The next greater number of a number x is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, return -1 for this number.

// Example 1:

// Input: nums = [1,2,1]
// Output: [2,-1,2]
// Explanation: The first 1's next greater number is 2; 
// The number 2 can't find next greater number. 
// The second 1's next greater number needs to search circularly, which is also 2.
// Example 2:

// Input: nums = [1,2,3,4,3]
// Output: [2,3,4,-1,4]

// approach : it will be same as previous question(nextGreaterElementType1 problem). Here we have to add the aray next to it(nums=[1,2,1] => [1,2,1,1,2,1]) but will take more time so instead of adding we can do it with modulo operation 
// we will run outer loop 0 to 2n-1 and in inner while loop condition instead of comparing stack peek with arr[i] we will compare it with arr[i%n]
// TC = O(n).
// because same as previous out loop will run 2n time and inner while loop will run total maximum 2n time so tc will be O(2n+2n) => O(n)

import java.util.*;

public class nextgreaterElementType2 {

    public static int[] nge(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[arr.length];
        for (int i = 2 * arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i % arr.length]) {
                st.pop();
            }
            // we check it because we only need upto n elements
            if (i < arr.length) {
                if (st.isEmpty()) {
                    nge[i] = -1;
                } else {
                    nge[i] = arr[st.peek()];
                }
            }
            st.push(i % arr.length);
        }
        return nge;

    }

    // print array function
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 3 };
        printArr(nge(nums));

    }

}
