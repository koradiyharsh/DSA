package recursion;

import java.util.Arrays;

public class PermutationOfArrayWithSwap {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3};
        printPermutation(arr , 0 , arr.length);
    }

    private static void printPermutation(int[] arr, int i, int n) {

        if(i==n){
            System.out.print(Arrays.toString(arr)+" ");
            return;
        }

        for(int j=i;j<n;j++){
            int temp =  arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            printPermutation(arr ,i+1 , n);
            temp =  arr[j];
            arr[j] = arr[i];
            arr[i] = temp;

        }

    }
}
