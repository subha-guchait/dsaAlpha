/*  Left Rotate the Array by One place
// [1,2,3,4,5] => [2,3,4,5,1]

// let rotateArrayBy1Place = function (arr) {
//   let temp = arr[0];
//   for (let i = 1; i < arr.length; i++) {
//     arr[i - 1] = arr[i];
//   }
//   arr[arr.length - 1] = temp;
//   return arr;
// };

// let arr1 = [1, 2, 3, 4, 5];

console.log(rotateArrayBy1Place(arr1)); */

public class leftRotateArrayBy1Place {
    public static int[] rotateArrayBy1Place(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        rotateArrayBy1Place(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
