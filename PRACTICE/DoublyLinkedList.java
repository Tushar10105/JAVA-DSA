import java.util.Scanner;

class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedList {
    Node head, tail;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void displayForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displayBackward() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        Scanner scanner = new Scanner(System.in);

        System.out.print("SIZE: ");
        int n = scanner.nextInt();

        System.out.println("THE " + n + " ELEMENTS:");
        for (int i = 0; i < n; i++) {
            list.insert(scanner.nextInt());
        }

        scanner.close();

        System.out.println("DOUBLY LINKED LIST (Forward):");
        list.displayForward();

        System.out.println("\nDOUBLY LINKED LIST (Backward):");
        list.displayBackward();

        System.out.println();
    }
}
