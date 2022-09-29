package stack_queue;

import java.util.Stack;

public class MaximumAreaOfHistogram {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 2, 3, 1};
        int leftSmall[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if(stack.isEmpty()){
                stack.push(0);
                leftSmall[i] = 0;
            }
            else {
                while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    stack.push(i);
                    leftSmall[i] = 0;
                } else {
                    stack.push(i);
                    leftSmall[i] = i;
                }
            }

        }


    }
}
