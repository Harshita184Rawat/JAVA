// program to set a bit to 1 

import java.util.Scanner;

public class SetBit {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.print("position of bit to set: ");
        int pos = sc.nextInt();
        int bitMask = 1<<pos;
        int newNumber = bitMask | n;
        System.out.print("New number is: "+newNumber);

    }
}
