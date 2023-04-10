// Program to update bit 

import java.util.Scanner;

public class UpdateBit {
    public static void main(String args[]) {
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter the position of bit to update: ");
        int pos = sc.nextInt();
        int bitMask = 1 << pos;
        System.out.print("Enter 1 to clear. \nEnter 2 to Set: ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                int notBitMask = ~bitMask;
                int newNumber = notBitMask & n;
                System.out.print("Result: " + newNumber);
                break;
            case 2:
                int newNum = bitMask | n;
                System.out.println("Result: " + newNum);
                break;
            default:
                System.out.print("Invalid choice.");

        }

    }
}
