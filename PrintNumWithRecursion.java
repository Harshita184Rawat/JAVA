import java.util.Scanner;

class PrintNumWithRecursion {
    public static void printNum(int number) {
        if (number == 0)
            return;
        System.out.println(number);
        printNum(number - 1);
    }

    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        printNum(number);
    }
}