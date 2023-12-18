import java.util.Scanner;

public class sample {
    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("fount at cell (" + i + "," + j + ")");
                    return true;
                }
            }

        }
        System.out.println("key not found");
        return true;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) { // matrix.length = rows
            for (int j = 0; j < matrix[0].length; j++) { // matrix[0].length = columns
                matrix[i][j] = sc.nextInt();
            }
        }

        // output
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix, 7);
    }
}