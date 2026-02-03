
    public class Node1 {

        int data;
        Node1 next;

        Node1(int data) {
            this.data = data;
        }

        public static Node1 insertatindex(Node1 head, int idx, Node1 insert) {

            if (idx == 0) {
                insert.next = head;
                return head;
            }

            Node1 temp = head;

            for (int i = 0; i < idx; i++) {

                if (temp.next == null) {
                    System.out.println("invalid index");
                    return head;
                }

                temp = temp.next;

            }

            insert.next = temp.next;
            temp.next = insert;

            return head;
        }

        public static void display(Node1 l) {
            Node1 temp = l;
            while (temp != null) {

                System.out.print(temp.data + " -> ");
                temp = temp.next;

            }

            System.out.print("null");
        }

        public static void main(String[] args) {

            Node1 a = new Node1(0);
            Node1 b = new Node1(1);
            Node1 c = new Node1(2);
            Node1 d = new Node1(3);
            Node1 e = new Node1(4);

            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;

            int idx = 2;

            int value = 333;
            Node1 insert = new Node1(value);

            display(insertatindex(a, idx, insert));

        }
    }
