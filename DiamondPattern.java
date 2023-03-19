public class DiamondPattern {
    public static void main(String args[]) {
        int n = 4;
        // for printing upper half
        for (int i = 1; i <= n; i++) {
            // for printing spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // for printing stars in upper half
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // for printing lower half
        for (int i = n; i >= 1; i--) {
            // for printing spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // for printing stars in lower half
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
