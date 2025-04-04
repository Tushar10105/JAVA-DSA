import java.util.Scanner;

class QueueArray {
    private int[] arr;
    private int front, rear, capacity;

    public QueueArray(int size) {
        this.capacity = size;
        this.arr = new int[size];
        this.front = this.rear = -1;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot enqueue " + item);
            return;
        }
        if (isEmpty()) front = 0; // Set front to 0 on first insert
        arr[++rear] = item;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! Cannot dequeue.");
            return -1;
        }
        int removedItem = arr[front++];
        if (front > rear) front = rear = -1; // Reset queue when empty
        return removedItem;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty.");
            return -1;
        }
        return arr[front];
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return rear == capacity - 1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + "|");
        }
        System.out.println();
    }
}

public class LinearQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter queue size: ");
        int size = scanner.nextInt();
        QueueArray queue = new QueueArray(size);

        while (true) {
            System.out.println("\nQueue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to enqueue: ");
                    int value = scanner.nextInt();
                    queue.enqueue(value);
                    break;

                case 2:
                    int dequeuedValue = queue.dequeue();
                    if (dequeuedValue != -1)
                        System.out.println("Dequeued element: " + dequeuedValue);
                    break;

                case 3:
                    int frontValue = queue.peek();
                    if (frontValue != -1)
                        System.out.println("Front element: " + frontValue);
                    break;

                case 4:
                    queue.display();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
