import java.util.*;

public class SumNnaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of N: ");
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= N; i++) {
            sum = sum + i;
        }
        System.out.print("Sum is : ");
        System.out.println(sum);
    }
}
