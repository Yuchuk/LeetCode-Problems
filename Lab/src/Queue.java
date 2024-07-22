package Lab.src;

public class Queue {

    static int front = -1;
    static int rear = 0;
    static int[] arr;

    private Queue() {
        arr = new int[10];
        front = -1;
        rear = 0;
    }

    private boolean enqueue(int val) {
        if (isSize() && isEmpty()) {
            front++;
            arr[front] = val;
            rear++;
            return true;
        } else if (isSize() && !isEmpty()) {
            arr[rear] = val;
            rear++;
            return true;
        }
        return false;
    }

    private boolean dequeue() {
        if (!isEmpty()) {
            front++;
            return true;
        } else
            return false;
    }

    private int peek() {
        return arr[front];
    }

    private boolean isEmpty() {
        if (front == -1 || front == rear)
            return true;
        else
            return false;
    }

    private boolean isSize() {
        if (rear <= arr.length)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Queue createQueue = new Queue();
        createQueue.enqueue(10);
        createQueue.enqueue(20);
        createQueue.enqueue(30);
        createQueue.enqueue(40);
        createQueue.enqueue(50);
        if (createQueue.isEmpty() == false) {
            System.out.println("First Element: " + createQueue.peek());
        }
        createQueue.dequeue();
        createQueue.enqueue(60);
        createQueue.enqueue(70);
        createQueue.dequeue();
        createQueue.dequeue();
        while(createQueue.isEmpty() == false) {
            System.out.println(" Element: " + createQueue.peek());
            createQueue.dequeue();
        }

        if (createQueue.isEmpty() == true) {
            System.out.println("Array is empty");
        }
    }
}
