import java.util.Scanner;

class QueueArray {
    private int[] arr;
    private int front, rear, capacity;

    public QueueArray(int size) {
        this.capacity = size;
        this.arr = new int[size];
        this.front = this.rear = -1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return rear == capacity - 1;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("QUEUE OVERFLOW! Can't ENQUEUE " + item);
            return;
        }
        if (isEmpty()) front = 0;
        arr[++rear] = item;
        System.out.println("ENQUEUED..");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("QUEUE UNDERFLOW! Can't DEQUEUE.");
            return -1;
        }
        int removed = arr[front++];
        if (front > rear) front = rear = -1;
        return removed;
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Its EMPTY..");
            return;
        }
        System.out.println("FRONT ELEMENT: " + arr[front] + " at INDEX: " + front);
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Its EMPTY.");
            return;
        }
        System.out.println("-----------------------");
        System.out.print("THE QUEUE: ");
        for (int i = front; i <= rear; i++) {
            System.out.print("|" + arr[i]);
        }
        System.out.println();
    }
}

public class LinearQueue {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("CAPACITY of the QUEUE: ");
        int size = scanner.nextInt();
        QueueArray queue = new QueueArray(size);

        while (true) {
            System.out.println("\nQUEUE OPERATIONS:");
            System.out.println("---------------------");
            System.out.println("1. ENQUEUE");
            System.out.println("2. DEQUEUE");
            System.out.println("3. PEEK");
            System.out.println("4. DISPLAY");
            System.out.println("5. EXIT");
            System.out.println("---------------------");
            System.out.print("WHAT IS THE CHOOSEN ONE: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("How many ELEMENTS U wanna ENQUEUE: ");
                    int count = scanner.nextInt();
                    if (queue.isFull()) {
                        System.out.println("Its ALREADY FULL !!!");
                    } else {
                        System.out.println("\nENTER " + count + " ELEMENTS:");
                        for (int i = 0; i < count; i++) {
                            if (!queue.isFull()) {
                                int value = scanner.nextInt();
                                queue.enqueue(value);
                            } else {
                                System.out.println("QUEUE FULL! NO MORE elements can be added.");
                                break;
                            }
                        }
                    }
                    break;

                case 2:
                    int removed = queue.dequeue();
                    if (removed != -1)
                        System.out.println("DEQUEUED ELEMENT: " + removed);
                    break;

                case 3:
                    queue.peek();
                    break;

                case 4:
                    queue.display();
                    break;

                case 5:
                    System.out.println("---------------------");
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;

                default:
                    System.out.println("INVALID CHOICE !!!\n TRY AGAIN...");
            }
        }
    }
}
