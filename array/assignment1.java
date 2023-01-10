import java.util.Arrays;

public class assignment1 {
    public static boolean containsDuplicate(int arr[]) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 2 };
        System.out.println(containsDuplicate(arr));
        int arr1[] = { 1, 2, 3, 4 };
        System.out.println(containsDuplicate(arr1));
    }
}
