// Input a string from the user.Create a new string called 'result' in which
// you will replace the letter 'e' in the original string with letter 'i'

import java.util.Scanner;

public class ReplaceLetterInResultString {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = ip.nextLine();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e')
                result = result + 'i';
            else
                result = result + str.charAt(i);
        }
        System.out.print(result);

    }
}
