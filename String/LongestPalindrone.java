package String;

public class LongestPalindrone {
    public static void main(String[] args) {
        String str = "aaaabbaa";

        int[][] dp = new int[str.length()][str.length()];
        int maxLength =1;
        for (int i = 0; i < dp.length; i++) {
            dp[i][i] = 1;
        }
        int start =0;
        for (int i = 1; i < dp.length; i++) {
            if (str.charAt(i - 1) == str.charAt(i)) {
                dp[i - 1][i] = 1;
                start =i-1;
                maxLength =2;


            }
        }
        for (int k = 3; k <= dp.length; ++k) {
            for (int i = 0; i < dp.length - k + 1; ++i) {
                int j = i + k - 1;
                if (dp[i + 1][j - 1]==1 && str.charAt(i) == str.charAt(j)) {
                    dp[i][j] = 1;
                    if (k > maxLength) {
                        start = i;
                        maxLength = k;
                    }
                }
            }
        }
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
}
