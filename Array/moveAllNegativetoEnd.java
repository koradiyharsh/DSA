package Array;

public class moveAllNegativetoEnd {
    public static void main(String[] args) {
        int[] arr = {1 ,-1 ,3 ,2 -7, -5 ,11 ,6};
        int n  = arr.length;
        int i = 0;
        int j=0;
        while (i < n){
            if(arr[i] > 0){
                i++;j++;
            }else{
                i++;
            }
            if(arr[i] > 0 && arr[j] < 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
