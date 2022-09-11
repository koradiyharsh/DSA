package Array;

import java.util.PriorityQueue;

public class MinMaxFind {
    public static void main(String[] args) {
        int arr[] = {3, 5, 4, 1, 9};
        int min  =  arr[0];
        int max =  arr[0];
        for(int i=1;i<arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
            }
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);

    }
}
