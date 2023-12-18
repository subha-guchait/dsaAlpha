public class diagonalSum {
    public static int sum(int matrix[][]) {
        int sum = 0;
        // broute force approach tc = 0(n2)
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix.length; j++) {
        // // for left turn
        // if (i == j) {
        // sum += matrix[i][j];
        // // for right turn
        // } else if (i + j == matrix.length - 1) {
        // sum += matrix[i][j];
        // }
        // }
        // }
        for (int i = 0; i < matrix.length; i++) { // tc = 0(n)
            // pd
            sum += matrix[i][i];
            // sd i+j = n-1 => j = n-1-i
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        System.out.println(sum(matrix));

    }
}
