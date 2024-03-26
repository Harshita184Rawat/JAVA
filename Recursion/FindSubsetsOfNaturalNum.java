// Program to find all the subsets of a set of first n natural numbers

import java.util.ArrayList;

public class FindSubsetsOfNaturalNum {
    public static void printSubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findSubset(int n, ArrayList<Integer> subset) {

        if (n == 0) {
            printSubset(subset);
            return;
        }

        // if element is added to the subset
        subset.add(n);
        findSubset(n - 1, subset);

        // if elements are not added to the subset
        subset.remove(subset.size() - 1);
        findSubset(n - 1, subset);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(n, subset);
    }
}
