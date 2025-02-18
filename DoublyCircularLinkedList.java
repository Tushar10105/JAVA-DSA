import java.util.Scanner;

class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}

public class DoublyCircularLinkedList {
    Node head, tail;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            head.next = head.prev = head;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        newNode.next = head;
        head.prev = newNode;
        tail = newNode;
    }

    public void displayForward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(Back to Head)");
    }

    public void displayBackward() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = tail;
        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        } while (temp != tail);
        System.out.println("(Back to Tail)");
    }

    public static void main(String[] args) {
        DoublyCircularLinkedList list = new DoublyCircularLinkedList();
        Scanner scanner = new Scanner(System.in);

        System.out.print("SIZE: ");
        int n = scanner.nextInt();

        System.out.println("THE " + n + " ELEMENTS:");
        for (int i = 0; i < n; i++) {
            list.insert(scanner.nextInt());
        }

        scanner.close();

        System.out.println("\nDOUBLY CIRCULAR LINKED LIST (Forward):");
        list.displayForward();

        System.out.println("\nDOUBLY CIRCULAR LINKED LIST (Backward):");
        list.displayBackward();
        System.out.println();
    }
}
