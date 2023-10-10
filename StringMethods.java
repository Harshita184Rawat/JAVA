import java.util.Scanner;

public class StringMethods {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        // length() method
        int size = str.length();
        System.out.println("String is : " + str);
        System.out.println("Size of String is : " + size);

        // charAt(index) method : to access each character of string
        System.out.println("Characters in String:  ");
        for (int i = 0; i < size; i++) {
            System.out.println(str.charAt(i));
        }
        System.out.println();
        // ParseInt() method of Integer class : covert string into int
        String s = "1234";
        int number = Integer.parseInt(s);
        System.out.println(s + " converted into " + number);

        // toString() method of String class: covert objects to string
        int num = 455;
        String string = Integer.toString(num);
        System.out.println("int converted to " + string + " string");

    }

}
