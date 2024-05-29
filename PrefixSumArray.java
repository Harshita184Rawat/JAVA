// Given an array arr[] of size N, find the prefix sum of the array. 
// A prefix sum array is another array prefixSum[] of the same size,
// such that the value of prefixSum[i] is arr[0] + arr[1] + arr[2] . . . arr[i].

// Input: arr[] = {10, 20, 10, 5, 15}
// Output: prefixSum[] = {10, 30, 40, 45, 60}

ublic class PrefixSumArray {

    public static void prifixSum(int[] arr, int n, int [] preSum){

        preSum[0] = arr[0];
        for(int i = 1;i<n;i++){
            preSum[i]=preSum[i-1]+arr[i];

        }

        for(int idx=0;idx<n;idx++){
            System.out.print(preSum[idx] + " ");
        }
    }
    public static void main(String[] args) {

        int[] arr = {10,20,10,5,15};
        int n = arr.length;
        int [] preSum = new int[n];
         
        prifixSum(arr, n, preSum);
    }

}
