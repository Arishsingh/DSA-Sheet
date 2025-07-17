//merge sorted  but here the  nodes are alrealt sorted so we are just adding them 
class node {
    int data;
    node next;

    node(int value) {
        data = value;
        next = null;
    }
}

public class level2K {
    public static void main(String[] args) {
        // first list: 1 -> 3 -> 5
        node a1 = new node(1);
        node a2 = new node(3);
        node a3 = new node(5);
        a1.next = a2;
        a2.next = a3;

        // second list: 2 -> 4 -> 6
        node b1 = new node(2);
        node b2 = new node(4);
        node b3 = new node(6);
        b1.next = b2;
        b2.next = b3;

        node mergedHead = merge(a1, b1);

        // print
        node temp = mergedHead;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // code to make the two nodes sorted

    //main merge code

    static node merge(node l1, node l2) {
        node mergeLL = new node(-1);  // dummy head
        node tail = mergeLL;

        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                tail.next = l1;//pointing small value which is on left
                l1 = l1.next;
            } else {
                tail.next = l2;//pointing to small value which is on right
                l2 = l2.next;
            }
            tail = tail.next;
        }

        // attach the rest
        if (l1 != null) {
            tail.next = l1;
        }
        if (l2 != null) {
            tail.next = l2;
        }

        return mergeLL.next;
    }
}
//do it again manually