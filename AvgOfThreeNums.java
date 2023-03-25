import java.util.Scanner;

// Enter 3 numbers from the user & make a function to print their average
public class AvgOfThreeNums {
    public static void average(Float a, Float b, Float c) {
        float avg = (a + b + c) / 3;
        System.out.println("Average is " + avg);
        return;
    }

    public static void main(String args[]) {
        System.out.println("Enter three numbers: ");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextInt();
        float b = sc.nextInt();
        float c = sc.nextInt();
        average(a, b, c);

    }
}
