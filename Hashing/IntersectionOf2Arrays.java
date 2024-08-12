// Find the Intersection of two arrays and retrun the size of Intersection set

import java.util.*;

public class IntersectionOf2Arrays {
     public static int intersection(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }

        int count=0;
        for(int j=0;j<arr2.length;j++){
            if(set.contains(arr2[j])){
                count = count + 1;
                set.remove(arr2[j]);

            }
        }

        return count;//intersection
    }
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[]= {6,3,9,2,9,4};
        System.out.println(intersection(arr1, arr2));
        
    }
}
