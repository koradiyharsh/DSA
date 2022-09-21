package recursion;

import java.util.Arrays;

public class subsetSum {
    public static void main(String[] args) {
        int arr[] = {1 ,2 ,2};
        int track = Arrays.stream(arr).sum();
        printSubSutSum(arr , 0 ,arr.length ,0 , track);

    }

    private static void printSubSutSum(int[] arr, int i, int n, int sum , int track) {
        if(track==0){
            System.out.print(sum+" ");
            return;
        }
        if(i>=n){
            return;
        }
        printSubSutSum(arr ,i+1 ,n , sum+arr[i] , track-arr[i]);
        printSubSutSum(arr ,i+1 ,n , sum , track-arr[i]);
    }
}
