// program to find maximun sum of subarray of size k

public class MaxSumOfSubarray
{
	public static void main(String[] args) {
		int[] arr = {2,9,31,-4,21,7};
		int k=3;
		int maxSum=0;
		for(int idx=1;idx < arr.length-k;idx++){
		    int sum=0;
		    for(int j=idx;j<idx+3;j++){
		        sum=arr[j]+sum;
		    }
		    
		    if(sum>maxSum)
		        maxSum=sum;
		}
		
		System.out.println(maxSum);
	}
}
