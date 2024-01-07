import java.util.*;

public class XPowerNUsingRecursion {
    public static int calPower(int n, int x) {
        if (n == 0)
            return 1;
        if (x == 0) {
            return 0;
        }
        int result = 1;
        result = (calPower(n - 1, x)) * x;
        return result;

    }

    public static void main(String args[]) {
        System.out.print("Enter value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter Value of x: ");
        Scanner ob = new Scanner(System.in);
        int x = ob.nextInt();
        int power = calPower(n, x);
        System.out.print(x + "^" + n + "=" + power);
    }
}
