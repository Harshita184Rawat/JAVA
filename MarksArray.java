// To store marks in array 
// physics = 87
// chemistry = 57
// English = 90
public class MarksArray {
    public static void main(String args[]) {
        // declaration of array
        int[] marks1 = new int[3];

        // initializing elements in array marks1
        marks1[0] = 87;
        marks1[1] = 57;
        marks1[2] = 90;

        // to print elements of marks1
        System.out.print("Array marks1: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(marks1[i] + " ");
        }
        System.out.println();
        // declaring and initializing array marks2
        int[] marks2 = { 24, 56, 67, 87 };
        System.out.print("Array marks2: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(marks2[i] + " ");
        }

    }
}