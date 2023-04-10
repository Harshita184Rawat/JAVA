// program to clear a bit (i.e convert it to 0)
import java.util.Scanner;

public class ClearBit {
    public static void main(String args[])
    {
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter number: ");
        int pos = sc.nextInt();

        // Bit mask
        int bitMask = 1<<pos;
        
        // Not of bitMask
        int bitMaskNot = ~bitMask;

        // AND bitMaskNot , n
        int newNumber = bitMaskNot & n;
        System.out.print("New number is: " + newNumber);

    }
}
