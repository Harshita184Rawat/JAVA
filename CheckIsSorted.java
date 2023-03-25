import java.util.Scanner;

// Take an array of numbers as input and check if it is an sorted in ascending order.

public class CheckIsSorted {
    public static boolean isSorted(int[] numbers) {
        int flag = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                continue;
            } else {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
            return false;
        else
            return true;
    }

    public static void main(String args[]) {
        System.out.print("Enter size of array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        // input array
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        // print array
        System.out.print("array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        // to check order
        System.out.println("Is Sorted : " + isSorted(numbers));
    }
}