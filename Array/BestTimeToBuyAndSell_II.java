package Array;

public class BestTimeToBuyAndSell_II {
    public static void main(String[] args) {
        int[] arr = {2, 30, 15, 10, 8, 25, 80};
        int n = arr.length-1;
        int[] space = new int[arr.length];
        int ptr = -1;
        int max  = Integer.MIN_VALUE;
        int p =-1;
        int maxPtr = 0;
        for(int i=n;i>=0;i--){
            if(arr[i] > max){
                max = arr[i];
            }
            space[i] = max - arr[i];
            if(space[i] > maxPtr){
                maxPtr = space[i];
                p = i;
            }
        }

    }

}
