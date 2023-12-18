package recursion;

public class firstOccurance {
    public static int firstOccur(int arr[], int key, int i) {
        if (i == arr.length)
            return -1;
        if (arr[i] == key)
            return i;
        return firstOccur(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 8, 1, 35, 6, 89 };
        System.out.println(firstOccur(arr, 35, 0));
    }
}
