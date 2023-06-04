import java.util.Scanner;

class Sq_without_fun {
    public static void main(String[] args) {
        int flag = 0;
        int j = 0;
        System.out.println("Enter number to check:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i < n / 2; i++) {
            if (n / i == i) {
                flag = 1;
                j = i;
                break;
            }
        }
        if (flag == 1)
            System.out.println(j + " is square root of " + n);
        else
            System.out.println("Not a perfect square");

    }
}