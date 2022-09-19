package recursion;

public class reverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int start = 0;
        int end = arr.length - 1;
        recursionOfArray(start, end, arr);
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }

    private static void recursionOfArray(int start, int end, int[] arr) {
        if (start > end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        recursionOfArray(start + 1, end - 1, arr);
    }

}
