/*  To print 0-1 trinagle
        0
        1 0
        0 1 0
        1 0 1 0
        0 1 0 1 0
    
 */
public class BitTriangle {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < i; j++) {
                    if (j % 2 != 0)
                        System.out.print(1 + " ");
                    else
                        System.out.print(0 + " ");
                }
                System.out.println();
            } else {
                for (int j = 0; j < i; j++) {
                    if (j % 2 != 0)
                        System.out.print(0 + " ");
                    else
                        System.out.print(1 + " ");
                }
                System.out.println();
            }

        }
    }
}
