package DP;

public class subsetEqualToKDP {
    public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
        int target = 9;

        boolean[][] dp = new boolean[arr.length+1][target+1];
        for(int j=0;j<dp[0].length;j++){
            dp[0][j] = false;
        }
        for(int i=0;i<dp.length;i++){
            dp[i][0] = true;
        }
        for(int i=1; i < dp.length; i++){
            for(int j=1;j<dp[0].length;j++){
                if(arr[i-1] <= j){
                    dp[i][j] = dp[i-1][j - arr[i-1]] || dp[i-1][j];
                }
                else{
                    dp[i][j] =  dp[i-1][j];
                }

            }
        }

        System.out.println(dp[arr.length][target]);

    }
}
