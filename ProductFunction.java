import java.util.Scanner;

public class ProductFunction {
    public static int productfunc(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String args[]) {
        System.out.println("Enter numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = productfunc(a, b);
        System.out.println("Product is :" + product);
    }
}
