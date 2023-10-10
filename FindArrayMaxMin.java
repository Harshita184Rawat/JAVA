
// Program to find max and min integer in an array.
import java.util.Scanner;

public class FindArrayMaxMin {
    public static void main(String args[]) {
        System.out.print("Enter size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        // input array
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        // print array
        System.out.print("array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        // max and min
        int max = array[0];
        int min = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < max) {
                min = array[i];
            }
        }
        System.out.println("Max is: " + max);
        System.out.println("Min is: " + min);

    }
}
