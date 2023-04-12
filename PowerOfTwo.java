
// Write a program to find if a number is a power of 2 or not
import java.util.*;

public class PowerOfTwo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if (n == 0)
            System.out.println("FALSE");
        int flag = 0;
        while (n != 1) {
            if (n % 2 != 0)

            {
                flag = 1;
                break;
            }
            n = n / 2;
        }
        if (flag == 1) {
            System.out.println("False");
        } else
            System.out.println("True");
    }
}
