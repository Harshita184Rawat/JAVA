import java.util.*;

public class FactorialUsingRecursion {
    public static void fact(int number, int factorial, int n) {
        factorial = factorial * number;
        if (number == 0 || number == 1) {
            System.out.println("Factorial is : " + factorial);
        } else if (number <= n) {
            fact(number - 1, factorial, n);

        }
        System.out.println("Factorial is : " + factorial);
    }

    public static void main() {
        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        int fatorial = 1;
        int n = number;
        fact(number, fatorial, n);

    }
}
