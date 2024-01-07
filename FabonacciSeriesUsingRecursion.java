

import java.util.*;

public class FactorialUsingRecursion {
    public static void seriesCal(int a, int b) {

        int c = a + b;
        if (c > 50)
            return;
        System.out.println(c + " ");
        seriesCal(b, c);
    }

    public static void main(String args[]) {
        int a = 0;
        int b = 1;
        System.out.println(a + "\n" + b);
        seriesCal(a, b);
    }
}
