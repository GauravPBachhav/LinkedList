
public class ClassNode {

    int data;
    ClassNode next;

    ClassNode(int data) {
        this.data = data;
    }

    static void display(ClassNode head) {
        ClassNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");

    }

    static ClassNode insertatstart(ClassNode head, int data) {
        if (head == null) {
            return new ClassNode(data);
        }
        ClassNode temp = head;
        temp.next = head;
        return head;
    }

    // static ClassNode insertAtindex(ClassNode head, int data, int idx) {
    //     return head;
    // }
    static ClassNode insertatEnd(ClassNode head, int data) {

        if (head == null) {
            return new ClassNode(data);
        }

        ClassNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new ClassNode(data);
        return head;
    }

    static ClassNode insertAtindex(ClassNode head, int data, int idx) {

        if (head == null) {
            return new ClassNode(data);

        }

        ClassNode temp = head;
        ClassNode insertNode = new ClassNode(data);

        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;

        }

        insertNode.next = temp.next;
        temp.next = insertNode;

        return head;

    }

    static ClassNode deleteOnindex(ClassNode head, int idx) {

        ClassNode temp = head;
        for (int i = 0; i < idx - 1; i++) {

            temp = temp.next;

        }

        temp.next = temp.next.next;

        return head;
    }

    static int length(ClassNode head) {
        ClassNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    static void searchelementusingwhile(ClassNode head, int element) {

        ClassNode temp = head;

        int target = element;
        int index = 0;
        while (temp != null) {
            if (temp.data == target) {

                System.out.println("Element " + target + " Found At Index -" + index);
            }
            temp = temp.next;
            index++;
        }

    }

    static void searchelement(ClassNode head, int element) {

        ClassNode temp = head;

        int lengthoflist = length(head);
        int target = element;
        for (int i = 0; i < lengthoflist; i++) {

            if (temp.data == target) {
                System.out.println("Element " + target + " Found At Index -" + i);
                return;
            }

            temp = temp.next;

        }

    }


    static void getnthnodefromend(ClassNode head , int idx)
    {

        ClassNode temp = head ;
        
int lengthoflist = length(head);
int indexfromstart = lengthoflist - idx ;
        for(int i = 0 ; i <= indexfromstart; i ++)
        {

            temp = temp.next;

        }

            System.out.println(temp.data);

    }





    // 🔹 Reverse function
    static ClassNode reverse(ClassNode head) {
        ClassNode prev = null;
        ClassNode current = head;

        while (current != null) {
            ClassNode next = current.next; // store next
            current.next = prev;           // reverse pointer
            prev = current;                // move prev forward
            current = next;                // move current forward
        }

        return prev; // new head
    }

    static void reverseusingrecursive(ClassNode head) {

        if (head == null) {
            return;
        }

        reverseusingrecursive(head.next);
        System.out.print(head.data + "->");

    }



// Middle of LinkedList 

static void middleoflinkedlist(ClassNode head )
{

    ClassNode temp = head ; 
    int length = length(head);
    int middle = length / 2;
    for(int i = 0 ; i < middle ; i++)
    {
        temp = temp.next;
    }

    System.out.println(temp.data);

}





    public static void main(String[] args) {

        ClassNode a = new ClassNode(1);
        ClassNode b = new ClassNode(2);
        ClassNode c = new ClassNode(3);
        ClassNode d = new ClassNode(4);
        ClassNode e = new ClassNode(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        display(a);
        // int data = 6;
        int idx = 2;
        System.out.println("------------------");

        // getnthnodefromend(a, idx);

        middleoflinkedlist(a);




        // display(deleteOnindex(a, idx));
        // int target = 5;
        // searchelement(a, 5);
        // searchelementusingwhile(a, target);


        // ClassNode head = reverse(a);
        // display(head);
        // System.out.println("------------------");
        // display(reverse(head));
        // ClassNode head = insertAtindex(a, data , idx);
        // display(head);
        // reverseusingrecursive(a);
    }
}
