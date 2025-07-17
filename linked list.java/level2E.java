//floyd's cycle detection
// loop detection

class Node {
    int data;
    Node next;
    Node(int val){
        data = val;
        next = null;
    }
}

public class level2E {
    public static void main(String[] args) {
        // create a looped list:
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2; // loop here!

        Node head = n1;

        if (hasLoop(head)) {
            System.out.println("Loop detected!");
        } else {
            System.out.println("No loop");
        }
    }

    static boolean hasLoop(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return true;
            }
        }
        return false;
    }
}
