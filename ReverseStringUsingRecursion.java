// Program to reverse string using recursion

import java.util.*;

public class ReverseStringUsingRecursion {
    public static void printReverse(String str, int idx) {
        if (idx == 0) {
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printReverse(str, idx - 1);

    }

    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int idx = str.length() - 1;
        printReverse(str, idx);

    }
}
