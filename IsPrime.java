import java.util.Scanner;

public class IsPrime {
    public static void checkIsPrime(int N) {
        int flag = 1;
        for (int i = 2; i <= N / 2; i++) {
            if (N % i == 0) {
                flag = 0;
            }
        }
        if (flag == 0) {
            System.out.println("Not prime");
        } else {
            System.out.println("Prime");
        }

    }

    public static void main(String args[]) {
        System.out.print("Enter N : ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        checkIsPrime(N);
    }
}
