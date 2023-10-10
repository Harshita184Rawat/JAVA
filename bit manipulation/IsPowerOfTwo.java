// program to check if a given number is power of 2 or not
class IsPowerOfTwo {
    public static void main(String args[]) {
        int n = 6;
        int x = n - 1;
        if ((n & x) == 0) {
            System.out.println("Power of two");
        } else
            System.out.println("Not power of Two");
    }
}