
// importing package that has Scanner class
import java.util.*;

public class Input {
    public static void main(String[] args) {
        // Input
        // Scanner class used to take input ,
        // sc object of scanner class
        Scanner sc = new Scanner(System.in);
        // next() function of Scanner class takes only one token/word from system
        String name = sc.next();
        System.out.println(name);
        // nextLine() function can take a whole line a input
        Scanner ip = new Scanner(System.in);
        String fullname = ip.nextLine();
        System.out.print(fullname);

    }
}
