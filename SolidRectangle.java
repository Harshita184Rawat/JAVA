
// to print rectangles like this
/*    **********
      **********
      **********
      **********
 */
import java.util.*;

public class SolidRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column:");
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
