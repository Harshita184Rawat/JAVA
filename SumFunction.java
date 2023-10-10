import java.util.Scanner;

public class SumFunction {
    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String args[]) {
        System.out.println("Enter numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = sum(a, b);
        System.out.println("Sum is : " + sum);
    }
}
