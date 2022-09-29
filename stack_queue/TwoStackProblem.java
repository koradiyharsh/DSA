package stack_queue;

class twoStack{
    int arr[] ;
    int arr1ptr;
    int arr2ptr;
    twoStack(int arrsize){
        arr = new int[arrsize];
        arr1ptr = -1;
        arr2ptr = arrsize;
    }

    public void push1(int data) {
        if(Math.abs(arr1ptr - arr2ptr) == 1){
            System.out.println("array is full..!!");
        }
        arr[++arr1ptr] = data;
    }

    public void push2(int data) {
        if(Math.abs(arr1ptr - arr2ptr) == 1){
            System.out.println("array is full..!!");
        }
        arr[--arr2ptr] = data;
    }

    public int pop1() {
        if(arr1ptr==-1){
            System.out.println("Not a single element present in stk1");
        }
        int value = arr[arr1ptr];
        arr1ptr--;
        return value;

    }

    public int pop2() {
        if(arr2ptr==-arr.length){
            System.out.println("Not a single element present in stk2");
        }
        int value = arr[arr2ptr];
        arr1ptr++;
        return value;
    }
}
public class TwoStackProblem {


    public static void main(String[] args) {
        twoStack ts =  new twoStack(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        System.out.println("Popped element from stack1 "+ts.pop1());
        ts.push2(40);
        System.out.println("Popped element from stack2 "+ts.pop2());
    }
}
