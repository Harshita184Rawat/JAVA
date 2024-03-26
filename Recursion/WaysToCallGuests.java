// Program to find the number of ways in which you can invite 'n' guests to your party, single or in pair

public class WaysToCallGuests {

    public static int callGuests(int n) {
        if (n <= 1) {
            return 1;
        }

        // Single
        int ways1 = callGuests(n - 1);

        // pair
        int ways2 = (n - 1) * callGuests(n - 2); // n-1 ways to pair

        return ways1 + ways2;

    }

    public static void main(String[] args) {
        int n = 4; // n= number of guests
        int totalWays = callGuests(n);
        System.out.println("Total number of ways to call guests are: " + totalWays);
    }
}
