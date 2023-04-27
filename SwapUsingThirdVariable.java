public class SwapUsingThirdVariable {
    public static int swap(int m, int n) {
        int temp = m;
        m = n;
        n = temp;
        System.out.println("Value of m = " + m + "\nValue of n = " + n);
        return 0;
    }

    public static void main(String args[]) {

        // Driver code
        int m = 9, n = 12;
        swap(m, n);
    }
}