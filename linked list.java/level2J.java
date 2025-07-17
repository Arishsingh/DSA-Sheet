//check my node is pallindrom or not
class node {
    int data;
    node next;

    node(int value) {
        data = value;
        next = null;
    }
}

public class level2J {
    public static void main(String[] args) {
        node n1 = new node(1);
        node n2 = new node(2);
        node n3 = new node(2);
        node n4 = new node(1);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        node head = n1;

        if (checkpali(head)) {
            System.out.println("Palindrome linked list.");
        } else {
            System.out.println("Not a palindrome.");
        }
    }

    static node findmid(node head) {
        node slow = head;
        node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static boolean checkpali(node head) {
       //base case
        if (head == null || head.next == null) {
            return true;
        }
        // step 1: find mid
        node mid = findmid(head);

        // step 2: reverse second half
        node prev = null;
        node curr = mid;
        node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        node right = prev;//right head
        node left = head;//left head

        // step 3: compare both halves
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
}
