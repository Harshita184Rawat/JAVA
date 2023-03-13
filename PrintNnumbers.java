import java.util.Scanner;

class PrintNnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Prints numbers till?");
        int N = sc.nextInt();
        for (int i = 0; i <= N; i++) {
            System.out.println(i);
        }

    }
}