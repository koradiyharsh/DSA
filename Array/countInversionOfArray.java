package Array;

public class countInversionOfArray {
    static int count = 0;
    public static void main(String[] args) {
        int[] array = {5 ,4 ,3 ,2 , 1};
        int end = array.length-1;
        int start = 0;
        recursionCall(array , start ,end);
        System.out.println(count);
    }

    private static void recursionCall(int[] array, int start, int end) {
        if(start<end){
            int mid =  (start+end)/2;
            recursionCall(array , start ,mid);
            recursionCall(array ,mid+1 ,end);
            countInversion(start , end , mid , array);
        }

    }

    private static void countInversion(int start, int end, int mid , int[] array) {
        if(start <  mid && array[start] > array[mid]){
            count+=1;
        }
        if(mid <  end && array[mid] > array[end]){
            count+=1;
        }
    }

}
