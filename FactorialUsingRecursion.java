import java.util.*;

public class FactorialUsingRecursion {
    public static int fact(int number) {
        if (number == 0 || number == 1)
            return 1;
        int factorialpre = fact(number - 1);
        int factorial_n = number * factorialpre;
        return factorial_n;
    }

    public static void main(String args[]) {
        int number;
        System.out.print("Enter Number: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        int result = fact(number);
        System.out.println("Factorial is " + result);
    }
}
