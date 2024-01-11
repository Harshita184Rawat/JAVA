import java.util.Scanner;

public class firstNLastOccuranceOfChar {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str, char ch, int idx) {
        if (idx == str.length()) {
            System.out.println("First occurance = " + first + " index");
            System.out.println("Last occurance = " + last + " index");
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == ch) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        findOccurance(str, ch, idx + 1);
    }

    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int idx = 0;
        findOccurance(str, 'a', idx);

    }
}
