import java.util.Scanner;

public class Calculator {
    public static void mian(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char ch = sc.next().charAt(0);
        switch (ch) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Division by 0");
                } else
                    System.out.println(a / b);
                break;
            case '%':
                if (b == 0) {
                    System.out.println("Ivalid valid value");
                } else
                    System.out.println(a % b);
                break;
            default:
                System.out.println("Invalid Operation");
        }
    }
}
