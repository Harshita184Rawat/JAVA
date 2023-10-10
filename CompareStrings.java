public class CompareStrings {
    public static void main(String args[]) {
        // String comparision
        String str1 = "hello";
        String str2 = "world";
        String str3 = "hello";

        // compareTo() method : to compare strings
        if (str1.compareTo(str2) == 0) {
            System.out.println("Strings are equal");
        } else
            System.out.println("String are NOT equal");

        System.out.println();

        if (str1.compareTo(str3) == 0)
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are NOT equal");

    }
}
