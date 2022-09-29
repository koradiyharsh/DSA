package stack_queue;

class Queue {

    int[] arr;
    int front = -1;
    int rear = -1;

    Queue(int size) {
        arr = new int[size];
        front = 0;
        rear = 0;
    }

    public void enqueue(int data) {
            arr[rear++] = data;
    }

    public int dequeue() {
        if(front==-1 && rear==-1){
            return -1;
        }
        int item  = arr[front];
        front =  front +1;
        return item;
    }

    public  int front(){
        if(front==-1 && rear==-1){
            return -1;
        }
        return arr[front];
    }
    public  int rear(){
        if(front==-1 && rear==-1){
            return -1;
        }
        return arr[--rear];
    }
}

public class implementQueue {
    public static void main(String[] args) {
        Queue queue = new Queue(1000);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        System.out.println(queue.dequeue());
        System.out.println("Front Item is " + queue.front());
        System.out.println("Rear Item is " + queue.rear());

    }
}
