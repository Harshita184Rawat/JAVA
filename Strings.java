import java.util.Scanner;

public class Strings {
    public static void main(String args[]) {
        // Concatenation
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first String: ");
        String s1 = sc.nextLine(); // takes whole line as input
        System.out.print("Enter second String: ");
        String s2 = sc.next(); // only take one word/token at a time
        String s3 = s1 + " " + s2;
        System.out.println(s3);

    }
}
