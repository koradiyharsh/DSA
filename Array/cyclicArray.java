package Array;

public class cyclicArray {
    public static void main(String[] args) {
        int[] arr = {1 ,2 ,3 ,4 ,5};
        int ele =  arr[arr.length-1];
        for(int i = arr.length-2;i >=0;i--){
            arr[i+1] = arr[i];
        }
        arr[0] = ele;
        for(int j=0;j < arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
