// Write a function to print the sum of all odd numbers from 1 to n.

import java.util.Scanner;

public class SumOddTillN {
    public static void sumN(int N) {
        int sum = 0;
        for (int i = 0; i <= N; i++) {
            sum = sum + i;
        }
        System.out.println("Sum is " + sum);
        return;
    }

    public static void main(String args[]) {
        System.out.print("Enter value of N : ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sumN(N);
    }
}
