// Prorgam to solve Tower Of Hanoi problem

import java.util.Scanner;

public class TowerOfHanoiUsingRecursion {

    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n - 1, src, dest, helper);
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n - 1, helper, src, dest);

    }

    public static void main(String[] args) {
        System.out.print("Enter the no. of disks: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towerOfHanoi(n, "S", "H", "D");

    }

}
