// Program to check whether an array is strictly increasing or not
// {1,2,3,5,7} : True
// {1,2,3,3,4} : False

public class IsStrictlySorrted {
    public static boolean isSorted(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }

        if (arr[idx] < arr[idx + 1]) {
            // array is sorted till now
            return isSorted(arr, idx + 1);
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5 };
        boolean result = isSorted(arr, 0);
        System.out.println(result);
    }
}
