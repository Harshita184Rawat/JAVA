import java.util.Scanner;
public class GetBit {
    public static void main(String args[])
    {
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("position of bit ot get: ");
        int pos = sc.nextInt();
        int bitMask = 1<<pos;
        int result = bitMask & n;
        if(result!=0)
            System.out.print("Bit is 1");
        else
            System.out.print("Bit is 0");
        
    }
}
