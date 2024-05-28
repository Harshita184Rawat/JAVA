
public class MergeSort {

    public static void conquer(int arr[], int sidx, int mid, int eidx) {
        int merged[] = new int[eidx - sidx + 1]; // new or result array
        int idx1 = sidx; // 1st subarray
        int idx2 = mid + 1; // 2nd subarray
        int x = 0; //indx of merged array

        while (idx1 <= mid && idx2 <= eidx) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x] = arr[idx1];
                x++;
                idx1++;
            } else { 
                merged[x++] = arr[idx2++];
            }
        }

        // if elements are present in only one array other is exhausted
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        while (idx2 <= eidx) {
            merged[x++] = arr[idx2++];
        }

        // to copy elements of merged array into original array(arr)
        for (int i = 0, j = sidx; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }

    }

    public static void divide(int arr[], int sidx, int eidx) {
        if (sidx >= eidx) {
            return;
        }
        int mid = sidx + (eidx - sidx) / 2; // (sidx + eidx)/2; not use if the addition exceeds the integer limit
        divide(arr, sidx, mid);
        divide(arr, mid + 1, eidx);
        conquer(arr, sidx, mid, eidx);

    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        int n = arr.length;

        // call
        divide(arr, 0, n - 1);

        // print result
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

    }
}
