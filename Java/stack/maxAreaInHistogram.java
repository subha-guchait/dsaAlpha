package stack;

import java.util.Stack;

//intution: 
// to calculate this problem we will check how we can increase width on both side(left and right) for each bar.
// by this will get width and multiplying by height with this width we will get area. then we will comapre it for each bar.
// logic:
// we will intilise 2 array to store nearest smaller to left and nearest smaller to right for each bar
// - we will store index of nsl(nearest smaller to left) and nsr(nearest smaller to right) in the array
// - but here an exception when no nsl and nsr found then if no nsl found then we will store -1 and if no nsr found we will store length of thr array
// - width = nsr - nsl -1
// - height = arr[i]
// then for each bar we will  calculate area and will compare it with max area

public class maxAreaInHistogram {
    public static int maxArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int[] nsl = new int[heights.length];
        int[] nsr = new int[heights.length];
        int maxArea = 0;

        // to calculate nearest smaller to left
        for (int i = 0; i < heights.length; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = st.peek();
            }
            st.push(i);
        }

        st = new Stack<>(); // to reset stack

        // to calculate nearest smaller to right
        for (int i = heights.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                nsr[i] = heights.length;
            } else {
                nsr[i] = st.peek();
            }
            st.push(i);
        }

        // for comparing area
        for (int i = 0; i < heights.length; i++) {
            int height = heights[i];
            int width = nsr[i] - nsl[i] - 1;
            int area = height * width;
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights = { 2, 1, 5, 6, 2, 3 };
        System.out.println(maxArea(heights));
    }
}