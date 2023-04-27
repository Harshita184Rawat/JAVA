public class SwapWithoutThirdVariable {
    public static void swap(int m, int n) {
        m = m - n;
        n = m + n;
        m = n - m;
        System.out.println("value of m = " + m + "\nvalue of n = " + n);
    }

    public static void main(String args[]) {
        int m = 34, n = 55;
        System.out.println("m = " + m + "\nn = " + n);
        swap(m, n);
    }
}
