package Array;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthMax_Min {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
        int[] arr = {7 ,10 ,4 ,3 ,20 ,15};
        int start  =  5;
        for(int i=0 ; i < arr.length;i++){
            if(i<start){
                queue.add(arr[i]);
            }else{
                if(queue.peek() > arr[i]){
                    queue.poll();
                    queue.add(arr[i]);
                }
            }
        }
        System.out.println(queue.peek());

    }
}
