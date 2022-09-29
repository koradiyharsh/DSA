package stack_queue;

import java.util.Stack;

public class nextSmallerElement {
    public static void main(String[] args) {
        int arr[] = {2,5,4,3};
        Stack<Integer> stak = new Stack<>();
        int[] res= new int[arr.length];
        res[arr.length-1] = -1;
        stak.push(arr[arr.length-1]);
        for(int i=arr.length-2;i>=0;i--){

            if(stak.peek() < arr[i]){
                res[i] = stak.peek();
                stak.push(arr[i]);
            }
            else{
                while (!stak.isEmpty() && stak.peek()>= arr[i]){
                    stak.pop();
                }
                if(stak.isEmpty()){
                    res[i] = -1;
                    stak.push(arr[i]);
                }else{
                    res[i] = stak.peek();
                    stak.push(arr[i]);
                }
            }

        }
        for(int j = 0; j< arr.length; j++){
            System.out.print(res[j]+" ");
        }
    }
}
