import java.util.*;

public class FactorialUsingRecursion {
    public static int fact(int number) {
        if (number == 0 || number == 1)
            return 1;
        int factorialpre = fact(number - 1);
        int factorial_n = number * factorialpre;
        return factorial_n;
    }

    public static void main() {
        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        int n = number;
        fact(number);
    }
}
