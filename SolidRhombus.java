/*  To print Solid rhombus
     
     ******
    ****** 
   ******
  ******
 ******
 
 */
public class SolidRhombus {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 0; i < row; i++) {
            for (int spaces = 0; spaces < row - i; spaces++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
