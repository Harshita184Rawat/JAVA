/* To print inverted half Pyramid(rotated by 180 deg.)
             *
            **
           ***
          ****
         *****
 */
class RotatedHalfPyramid {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            // for printinf spaces
            for (int j = 1; j <= n - i; j++) {

                System.out.print(" ");
            }
            // for
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }
}