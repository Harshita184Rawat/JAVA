// Take an array of Strings input from the user and find the cumulative(combined)
// length of all those strings.

import java.util.Scanner;

public class StringArray {
    public static void main(String args) {
        System.out.print("Enter size is String array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String str[] = new String[size];
        System.out.print("Enter the elements of Array: ");
        for (int i = 0; i < size; i++) {
            str[i] = sc.next();
        }

        // concatenate all the string in string array
        String fullString = "";
        for (int i = 0; i < size; i++) {
            fullString = fullString + str[i];
        }
        System.out.print("length of concatenated String: " + fullString.length());
    }
}
