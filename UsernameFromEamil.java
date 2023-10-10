// Input an email from the use.You have to create a username from the email by deleting
// the part that comes after '@'.Display that username tio the user.

import java.util.Scanner;

public class UsernameFromEamil {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        String username = "";
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@')
                break;
            else
                username = username + email.charAt(i);
        }
        System.out.print("username is : " + username);
    }

}
