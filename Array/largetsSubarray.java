package Array;

public class largetsSubarray {
    public static void main(String[] args) {
        int arr[]  = {-2 ,-3 ,4 ,-1 ,-2 ,1 ,5 ,-3};
        int total = 0;
        int gtotal = 0;
        for(int i=0;i<arr.length;i++){
                total+=arr[i];
                if(gtotal < arr[i]){
                    gtotal =  arr[i];
                }
                if(total < 0){
                    total =0;
            }
        }
        System.out.println(gtotal);

    }
}
