// Sum first n natural numbers 

import java.util.Scanner;

class SumNaturalNumUsingRecursion {

    public static void sumNumb(int i, int sum, int number) {
        if (i == number) {
            sum = sum + i;
            System.out.print("Sum is " + sum);
            return;
        }
        sum = sum + i;
        sumNumb(i + 1, sum, number);
    }

    public static void main(String[] args) {
        System.out.print("SUM OF FIRST N NATURAL NUMBERS\n");
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        int i = 1;
        sumNumb(i, sum, number);

    }
}
