// Program to print permutations of a string

import java.util.Scanner;

public class StringPermutation {

    public static void printPremutation(String str, String prem, int idx) {
        if (str.length() == 0) {
            System.out.println(prem);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currchar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPremutation(newStr, prem + currchar, idx);
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Permutations are: ");
        printPremutation(str, "", 0);

    }
}

