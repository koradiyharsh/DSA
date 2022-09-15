package Array;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {9 ,7 ,3 ,6 ,2};
        int left = 0;
        int right = arr.length-1;
        mergeSort(arr ,left ,right);
    }

    private static void mergeSort(int[] arr, int left, int right) {
        
        if(left < right){
            int mid =  (left+right)/2;
            mergeSort(arr ,left ,mid);
            mergeSort(arr ,mid+1 ,right);
            mergeing(arr,left , mid ,right);
        }
    }

    private static void mergeing(int[] arr, int left, int mid, int right) {
        int temp[] = new int[left+right+1];
        int i = left;
        int j = mid+1;
        int k = left;
        while (i<=mid && j<=right){
            if(arr[i] >  arr[j]){
                temp[k] =  arr[j];
                k++;
                j++;
            }
            else{
                temp[k] =  arr[i];
                k++;
                i++;
            }
        }
        if(i==mid){
            while (k <= j){
                temp[k] = arr[j];
                k++;
                j++;
            }
        }
        if(j==right){
            while (i <= k){
                temp[k] = arr[i];
                k++;
                i++;
            }
        }
    }

}
