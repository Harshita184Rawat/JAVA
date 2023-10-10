import java.util.Scanner;

public class CalculateFactorial {
    public static void factorialfunc(int n) {
        if (n < 0) {
            System.out.print("Invalid Input");
            return;
        }
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + n + " is " + factorial);
        return;
    }

    public static void main(String args[]) {
        System.out.print("Enter value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factorialfunc(n);
    }
}
