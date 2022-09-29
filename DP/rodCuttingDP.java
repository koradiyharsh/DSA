package DP;

public class rodCuttingDP {

    public static void main(String[] args) {
        int N  = 5;
        int[] prices = {2 ,5 , 7 ,8 ,10};

        int[][] dp = new int[N+1][N+1];

        for(int i=0 ;i < dp.length;i++){
            for(int j=0; j < dp[0].length; j++){
                if(i==0 || j ==0){
                    dp[i][j]=0;
                }
                else if(i<=j){
                    dp[i][j] = Math.max(prices[i-1] + dp[i][j-i] , dp[i-1][j]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        System.out.println(dp[N][N]);
    }


}
