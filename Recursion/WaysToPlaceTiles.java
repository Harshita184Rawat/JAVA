public class WaysToPlaceTiles {

    public static int placeTiles(int n, int m) {
        if (n == m) {
            return 2;
        }

        if (n < m) {
            return 1;
        }
        // vertical placement
        int vertPlacements = placeTiles(n - m, m);

        // horizontal placement
        int horPlacements = placeTiles(n - 1, m);

        return horPlacements + vertPlacements;

    }

    public static void main(String[] args) {
        int n = 4, m = 2;
        int totalWays = placeTiles(n, m);
        System.out.println("Total ways = " + totalWays);
    }

}
