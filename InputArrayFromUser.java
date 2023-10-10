import java.util.Scanner;

public class InputArrayFromUser {
    public static void main(String args[]) {
        System.out.print("Enter size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        // input array elements
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        // to print array
        System.out.println("numbers : ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }

    }
}
