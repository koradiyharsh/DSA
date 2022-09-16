package Array;

import java.util.Arrays;

public class chocolateDistributionProblem {
    public static void main(String[] args) {
      int  arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50} ;
      int m = 7;
      int k = 0;
      Arrays.sort(arr);
      int min = Integer.MAX_VALUE;
      for(int i=0;i<arr.length;i++){
        if(i < m-1){
            continue;
        }else{
            min = Math.min(min , arr[i] - arr[k]);
            k++;
        }
      }
      System.out.println(min);
    }
}
