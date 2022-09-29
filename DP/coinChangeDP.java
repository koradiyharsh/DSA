package DP;

public class coinChangeDP {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 6};
        int target = 10;
        int n = 4;

        int dp[][] = new int[arr.length + 1][target + 1];
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = 0;
        }
        for (int j = 0; j < dp.length; j++) {
            dp[j][0] = 1;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i][j - arr[i - 1]] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        System.out.println(dp[arr.length][target]);

    }
}
