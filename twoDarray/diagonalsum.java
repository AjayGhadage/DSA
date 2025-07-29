package twoDarray;

public class diagonalsum {
    public static int diagonalSum(int[][] matrix) {
        if (matrix.length == 0) return 0;

        int sum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) { // Primary diagonal
                    sum += matrix[i][j];
                }
                if (i + j == n - 1 && i != j) { // Secondary diagonal, avoid double-counting center
                    sum += matrix[i][j];
                }
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int sum = diagonalSum(matrix);
        System.out.println("Diagonal Sum: " + sum);
    }
}
