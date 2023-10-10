import java.util.Scanner;

// Write a function that takes in the radius as input and returns the circumference of a circle.

public class FindCircumference {
    public static void circumference(Float radius) {
        double circum = 2 * 3.14 * (radius);
        System.out.println("Circumference is " + circum);
        return;

    }

    public static void main(String args[]) {
        System.out.print("Enter radius: ");
        Scanner ip = new Scanner(System.in);
        Float radius = ip.nextFloat();
        circumference(radius);

    }
}