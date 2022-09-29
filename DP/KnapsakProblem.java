package DP;

public class KnapsakProblem {
    public static void main(String[] args) {
        int[] wt = {1 ,2 ,4 ,5};
        int[] val = {5 ,4 , 8 ,6};
        int n = wt.length;
        int w = 5;
        int result =  knapsakeProblem(wt , val ,n , w);
        System.out.println(result);

    }

    private static int knapsakeProblem(int[] wt, int[] val, int n, int w) {
        if(n == 0 || w==0 ){
            return 0;
        }
        if(wt[n-1] <= w) {
           return   Math.max(val[n-1]+knapsakeProblem(wt, val, n - 1, w - wt[n - 1]), knapsakeProblem(wt, val, n - 1, w));
        }
        return knapsakeProblem(wt ,val ,n-1 , w);

    }
}
