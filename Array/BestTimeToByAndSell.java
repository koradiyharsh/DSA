package Array;

public class BestTimeToByAndSell {
    public static void main(String[] args) {
        int[] arr = {7 , 6 , 4 , 3 , 1};
        int n = arr.length-1;
        int[] traceHigh = new int[arr.length];
        int Max =  Integer.MIN_VALUE;
        for(int i=n;i>=0;i--){
            if(arr[i] > Max){
                Max =  arr[i];
                traceHigh[i] = arr[i];
            }else{
                traceHigh[i] = Max;
            }
        }
        int result = 0;
        for(int i=0;i<arr.length;i++){
            if(traceHigh[i] - arr[i]  > result){
                result =  traceHigh[i] - arr[i];
            }
        }
        System.out.println(result);
    }
}
