// program to find power of a number x using recursion maintaining memory stack height of order logn

import java.util.*;

public class PowerUsingRecursionLognHeight {
    public static int calPower(int n, int x) {
        if (n == 0)
            return 1;
        if (x == 0) {
            return 0;
        }
        if (n % 2 == 0)// if n is even
        {
            return calPower(n / 2,x) * calPower(n/2 ,  x ) ;
        } else { // if n is odd
            return calPower(n/2, x) * calPower(n/2, x ) *x; 
        }

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
