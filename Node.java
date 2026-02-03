
public class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }

    public static void insertatindex(Node head, int idx) {
        Node temp = head;
        Node insert = new Node(1000);

        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }

        insert.next = temp.next;
        temp.next = insert;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");

    }

    public static void main(String[] args) {

        Node a = new Node(12);

        Node b = new Node(1);

        Node c = new Node(2);

        Node d = new Node(3);

        Node e = new Node(4);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // display(a);
        int index = 2;
        insertatindex(a, index);

    }

}
