// program to find maximun sum of subarray of size k using sliding window approach

public class MaxSubarraySum
{
	public static void main(String[] args) {
		int[] a = {2,9,31,-4,21,7};
		int k=3; // size of one subarray or window
		int wSum = 0;// window sum
		int maxSum = Integer.MIN_VALUE;
		
		// First window sum
		for(int i=0;i<k;i++){
		    wSum=wSum+a[i];
		}
		
		// Slide window and find maxSum window
		for(int i =3;i<a.length;i++){
		    wSum=wSum - a[i-k]+a[i];
		    // compare wSum and maxSum
		    if(wSum>maxSum){
		        maxSum=wSum;
		    }
		}
		
		System.out.println(maxSum);
	}
}
