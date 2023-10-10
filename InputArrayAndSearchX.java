
// Take an array as input from user.Search for a given number 
// x and print the index at which it is found
import java.util.Scanner;

public class InputArrayAndSearchX {
    public static void main(String args[]) {
        System.out.print("Enter size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        // input array elements
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        // print elements
        System.out.print("Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("Enter element x to search: ");
        int x = sc.nextInt();
        // to search x in array
        for (int i = 0; i < size; i++) {
            if (x == array[i]) {
                System.out.println("x found at index: " + i);
                break;
            }
        }

    }
}
