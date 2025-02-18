import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SingleLinkedList {
    Node head;

    public void insert(int data) {
        Node nd = new Node(data);
        if (head == null) {
            head = nd;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = nd;
    }

    public void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        SingleLinkedList lst = new SingleLinkedList();
        Scanner scan = new Scanner(System.in);

        System.out.print("Size of the LINKED LIST: ");
        int n = scan.nextInt();

        System.out.print("ELEMENTS:\n");
        for (int i = 0; i < n; i++) {
            lst.insert(scan.nextInt());
        }
        scan.close();

        System.out.println("THE SINGLE LINKED LIST:");
        lst.Display();
 		System.out.println();
    }
}
