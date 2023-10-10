public class SubStrings {
    public static void main(String args[]) {
        String str = "This code belongs to Harshita";
        System.out.println("String : " + str);
        // to extract subString Harsita
        // subString(beg index, end index) method
        String subStr = str.substring(21, str.length());
        System.out.println("Substring is : " + subStr);
    }
}
