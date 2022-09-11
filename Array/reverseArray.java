package Array;

public class reverseArray {
    public static void main(String[] args) {
        int array[] = {1, 2, 3 ,4,5};
        int start = 0;
        int end = array.length-1;
        for (int i = start; i <= end; i++ , end--) {
            int temp =  array[i];
            array[i] =  array[end];
            array[end] = temp;
        }
        for (int ele: array) {
            System.out.println(ele);
        }
    }

}
