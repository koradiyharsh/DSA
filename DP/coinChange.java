package DP;

public class coinChange {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3};
        int target = 4;
        int n =3;
        int result  =  coinChangeProblem(arr , target , n);
        System.out.println(result);

    }

    private static int coinChangeProblem(int[] arr, int target, int n) {
        if(target==0){
            return 1;
        }
        if(n==0){
            return 0;
        }

        if(arr[n-1] <= target){
           return coinChangeProblem(arr , target - arr[n-1] ,n)+coinChangeProblem(arr , target ,n-1);
        }
        return coinChangeProblem(arr , target , n-1);

    }
}
