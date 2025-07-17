class Node {
    int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }
}

public class level1Q {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(4);
        Node node4 = new Node(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        Node head = node1;

        int data = 3;
        int position = 2;
        Node newnode = new Node(data);

        if (position == 0) {
            newnode.next = head;
            head = newnode;
        } else {
            Node temp = head;
            for (int i = 0; temp != null && i < position - 1; i++) {
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("position not found");
                return;
            }
            newnode.next = temp.next;
            temp.next = newnode;
        }

        // print
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " -> ");
            t = t.next;
        }
        System.out.println("null");
    }
}

