import java.util.Scanner;

class StackArray {
    private int[] arr;
    private int top;
    private int capacity;

    public StackArray(int size) {
        this.capacity = size;
        this.arr = new int[size];
        this.top = -1;
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + item);
            return;
        }
        arr[++top] = item;
        System.out.println("\nELEMENT "+arr[top]+" pushed onto stack at index "+top);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1;
        }
        return arr[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty.");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print("|"+arr[i]);
        }
        System.out.println();
    }
}

public class Stack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int size = scanner.nextInt();
        StackArray stack = new StackArray(size);

        while (true) {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    //System.out.println("Enter "+size+" element to push: ");
                    System.out.println("Enter the element to be push: ");
                    //for(int i=0;i<size;i++){
                    int value = scanner.nextInt();
                    stack.push(value);
                    //}
                    break;

                case 2:
                    int poppedValue = stack.pop();
                    if (poppedValue != -1)
                        System.out.println("Popped element: " + poppedValue);
                    break;

                case 3:
                    int topValue = stack.peek();
                    if (topValue != -1)
                        System.out.println("Top element: " + topValue);
                    break;

                case 4:
                    stack.display();
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
