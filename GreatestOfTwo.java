import java.util.Scanner;

// Write a function which takes in 2 numbers and returns the greater of those two

public class GreatestOfTwo {
    public static void checkgreater(int a, int b) {
        if (a > b)
            System.out.println(a + " is greater");
        else
            System.out.println(b + " is greater");
        return;
    }

    public static void main(String args[]) {
        System.out.print("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        checkgreater(a, b);

    }
}
