
// program to find transpose of a matrix
import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String args[]) {
        System.out.println("Enter row and col: ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        if (row != col) {
            System.out.println("Only square matrix can be transpose ! \nrow must equal to col.");
            return;

        }

        int[][] matrix = new int[row][col];
        // input matrix
        System.out.println("Enter elements of matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        // print matrix
        System.out.println("matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // to transpose
        int temp;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i > j) {
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        // print transpose
        System.out.println("Transposed matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
