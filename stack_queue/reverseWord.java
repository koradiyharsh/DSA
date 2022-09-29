package stack_queue;

import java.util.Stack;

public class reverseWord {
    public static void main(String[] args) {
        String str  = "data structures and algorithms";
        String s[] = str.split(" ");
        Stack<String> stk = new Stack<>();
        for(int i=0;i<s.length;i++){
            stk.push(s[i]);
        }
        while (!stk.isEmpty()){
            System.out.print(stk.pop()+" ");
        }
    }
}
