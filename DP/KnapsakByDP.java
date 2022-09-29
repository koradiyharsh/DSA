package DP;

public class KnapsakByDP {
    public static void main(String[] args) {
        int[] wt = {1 ,2 ,4 ,5};
        int[] val = {5 ,4 , 8 ,6};
        int n = wt.length;
        int W = 5;
        int dp[][] = new int[n+1][W+1];
        for(int i=0; i<=n;i++){
            for(int j=0; j<=W;j++){
                if(i==0 || j==0){
                    dp[i][j] = 0;
                }
                else if(wt[i-1] <= j){
                    dp[i][j] = Math.max(val[i-1]+dp[i-1][j - wt[i-1]] , dp[i-1][j]);
                }
                else{
                    dp[i][j] =  dp[i-1][j];
                }

            }
        }

        System.out.println(dp[n][W]);

    }
}
