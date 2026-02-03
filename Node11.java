
public class Node11 {

    int data;
    Node11 next = null;

    Node11(int data) {
        this.data = data;
    }

    public static Node11 insertartindex(Node11 head, int idx, int value) {

        Node11 temp = new Node11(value);

        Node11 tempp = head;

        for (int i = 1; i < idx - 1; i++) {
            tempp = tempp.next;

        }

        temp.next = tempp.next;
        tempp.next = temp;

        return head;
    }

    static void display(Node11 head) {
        Node11 temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
        Node11 a = new Node11(0);
        Node11 b = new Node11(1);
        Node11 c = new Node11(2);
        Node11 d = new Node11(3);
        Node11 e = new Node11(4);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        int idx = 2;
        int value = 5;
        Node11 temp = insertartindex(a, idx, value);

        display(temp);

    }
}
