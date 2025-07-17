//zig zag merge (medium level question)

class node {
    int data;
    node next;

    node(int value) {
        data = value;
        next = null;
    }
}

public class level2M {
    node head;

    public void zigzag() {
        // find mid
        node slow = head;
        node fast = head.next; // to handle the even case
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        node mid = slow;

        // reverse second half
        node curr = mid.next;
        mid.next = null;

        node prev = null;
        node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // alternate merge
        node left = head;
        node right = prev;
        node nextL, nextR;

        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    public void print() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        // create nodes manually
        node node1 = new node(1);
        node node2 = new node(2);
        node node3 = new node(3);
        node node4 = new node(4);
        node node5 = new node(5);

        // link them
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        // put them in the linked list class
        level2M ll = new level2M();
        ll.head = node1;

        // print before
        ll.print();

        // zigzag
        ll.zigzag();

        // print after
        ll.print();
    }
}
