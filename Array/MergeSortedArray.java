package Array;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1 ,2 ,3 , 0 ,0 ,0};
        int[] nums2 = {2 ,5 ,6};
        int m = nums1.length;
        int n =  nums2.length;
        int start = 0;
        int j=0;
        while(start < nums1.length){

            if(j < n){
                if(nums1[start] <= nums2[j])
                {
                    start++;
                }else{
                    int temp = nums1[start];
                    nums1[start] = nums2[j];
                    nums2[j] = temp;
                    Arrays.sort(nums2);
                    start++;
                }
            }
        }
        for(int i=0;i<nums1.length;i++){
            System.out.print(nums1[i]+" ");
        }
     }
}
