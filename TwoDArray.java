
// To input and print a matrix/2D array
import java.util.Scanner;

public class TwoDArray {
    public static void main(String args[]) {
        System.out.println("Enter row and col: ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        // input matrix
        System.out.println("Enter elements of matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        // to print matrix
        System.out.println("matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
