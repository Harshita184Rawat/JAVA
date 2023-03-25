import java.io.*;
import java.util.Scanner;

public class IsEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("number is EVEN");
        } else {
            System.out.println("number is ODD");
        }
    }
}
