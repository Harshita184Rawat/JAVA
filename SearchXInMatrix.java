import java.util.Scanner;

// program to take a matrix input from user.
// Search for a given number x and print the indices at which it occurs.

public class SearchXInMatrix {
    public static void main(String args[]) {
        System.out.print("Enter row and col: ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        // input matrix
        System.out.println("Enter elements of row-wise matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.print("Enter element x to be searched: ");
        int x = sc.nextInt();
        // to search x in matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == x) {
                    System.out.println("x found at location ( " + i + ", " + j + " )");
                } else if (matrix[i][j] != x && i == row - 1 && j == col - 1) {
                    System.out.println("Not found");
                }
            }
        }
    }
}
