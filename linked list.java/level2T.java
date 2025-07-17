class node {
    int data;
    node next;

    node(int value) {
        data = value;
        next = null;
    }
}

public class level2T {
    public static void main(String[] args) {
        node n1 = new node(1);
        node n2 = new node(2);
        node n3 = new node(3);
        node n4 = new node(4);
        node n5 = new node(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        node head = n1;

        int pos = 2; // after 2nd position

        node temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }

        // remove next node
        if (temp.next != null) {
            temp.next = temp.next.next;
        }

        // print
        node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}

