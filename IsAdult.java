import java.util.*;

class IsAdult {
    public static void main(String[] arsg) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("person is adult");
        } else {
            System.out.println("person is not an adult");
        }

    }

}
