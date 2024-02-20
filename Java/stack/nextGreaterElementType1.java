/* The next greater element of some element x in an arr is the first greater element that is to the right of x in the same arr.

input: arr = [6,8,0,1,3]
output: next greater elemnet = [8,-1,1,3,-1]
*/
package stack;

import java.util.*;

public class nextGreaterElementType1 {

    // brute force : just comparing element with next elemnt with the help of nexted
    // loop. T.C.=> O(n2).
    public static int[] ngeBruteForce(int arr[]) {
        int[] nge = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nge[i] = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    nge[i] = arr[j];
                    break;
                }
            }
        }
        return nge;
    }

    // optimal approach : using stack

    // we will take a stack and nge array to store next greater element
    // here we will traving array form right to left
    // next inside this loop we will reun an while loop.
    // while loop will pop our stack. it will run if our stack is not empty and
    // current element is greater than peek of stack
    // then we check if stack is empty that means no greater elemnt found we will
    // store -1 in nge;
    // if it is not empty we will store peek of stack in nge
    // and in last step we will push the element in stack
    // -- Here time complexity will be O(n)
    // because the outer loop will run n time and inner loop will run some times 1
    // times, some times 2 times and some time may be 0 times and total maximum no
    // of loop can run will be n times so time complexity will be O(n+n) => O(n)

    public static int[] nge(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            // int count = 0;
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                // count++;
                st.pop();
            }
            // System.out.println(count);
            if (st.isEmpty()) {
                nge[i] = -1;
            } else {
                nge[i] = st.peek();
            }
            st.push(arr[i]);
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
        // int[] arr = { 6, 8, 0, 1, 3 };
        // printArr(ngeBruteForce(arr));
        int[] arr1 = { 4, 9, 7, 2, 4, 3, 5, 1 };
        printArr(nge(arr1));

    }
}
