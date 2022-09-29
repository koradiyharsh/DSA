package stack_queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class firstNonRepeatingcharacter {
    public static void main(String[] args) {
        String str = "aabc";
        int[] arr = new int[26];
        Queue<Character> queue = new LinkedList<>();
        for(int i=0 ; i< str.length(); i++){
            int ascii = 97;
            int idx = (int) str.charAt(i) - ascii;
            if(arr[idx]==0){
                if(queue.isEmpty()){
                    System.out.print(str.charAt(i)+" ");
                    queue.add(str.charAt(i));
                    arr[idx]++;
                }else{
                    System.out.print(queue.peek()+" ");
                    arr[idx]++;
                    queue.add(str.charAt(i));
                }
            }
            else{
               queue.remove(str.charAt(i));
               if(queue.size()==0){
                   System.out.print("#"+" ");
               }else{
                   System.out.print(queue.peek()+" ");
               }
            }
        }
    }
}
