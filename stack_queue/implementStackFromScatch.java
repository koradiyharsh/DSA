package stack_queue;

class stack {

    int top   = -1;
    int[] arr;
    stack(){
        arr  =new int[1000];
    }

    boolean checkStacksize(){
        if(top < 0){
            return false;
        }
        return true;
    }

    void push(int data){
        top++;
        arr[top] = data;
    }

    int pop(){

        // check the stack size
        if(checkStacksize()){
            return arr[top--];

        }
        return -1;
    }

    int peek(){

        if(checkStacksize()){
            return arr[top];
        }
        return -1;
    }

    public void printStack() {

        for(int i=top;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}

public class implementStackFromScatch {
    public static void main(String[] args) {
        stack stack = new stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop() + " Popped from stack");
        System.out.println("Top element is :" + stack.peek());
        System.out.print("Elements present in stack :");
        stack.printStack();
    }
}
