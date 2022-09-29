package DP;

public class subsetEqualToK {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3 , 4};
        int target = 4;

        boolean result  =  findSubset(arr , arr.length , target);
        System.out.println(result);
    }

    private static boolean findSubset(int[] arr, int n, int target) {
        if(target==0){
            return true;
        }
        else if(n==0 || target<0){
            return false;
        }
        if(arr[n-1] <= target){
            return findSubset(arr , n-1 , target- arr[n-1]) || findSubset(arr , n-1 ,target);
        }
        return findSubset(arr ,n-1 ,target);
    }
}
