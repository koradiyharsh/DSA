package DP;

public class rodCutting {
    public static void main(String[] args) {
        int N  = 5;
        int[] prices = {2 ,5 , 7 ,8 ,10};
        int result =  rodCuttingMethod(N , prices , N);
        System.out.println(result);
    }

    private static int rodCuttingMethod(int n, int[] prices, int length) {
        if(n==0 || length ==0 ){
            return 0;
        }

        if(n <= length){
            return Math.max(prices[n-1] + rodCuttingMethod(n ,prices , length-n) , rodCuttingMethod(n-1 ,prices ,length));
        }

        return rodCuttingMethod(n-1 ,prices , length);

    }
}
