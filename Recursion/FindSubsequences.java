// Program to find subsequences of string

public class FindSubsequences {

    public static void subsequence(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);

        // char to be add in subsequence
        subsequence(str, idx + 1, newString + currChar);

        // char not to be in subsequence
        subsequence(str, idx + 1, newString);
    }

    public static void main(String args[]) {
        String str = "abc";
        subsequence(str, 0, "");

    }

}
