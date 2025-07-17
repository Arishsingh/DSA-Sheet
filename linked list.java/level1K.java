class Node{
    int data;
    Node next;

    Node(int value){
        data = value;
        next = null;
    }
}
public class level1K {
    public static void main(String[] args) {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(100);

        node1.next=node2;
        node2.next=node3;
        node3.next=node4;

        Node head = node1;
        while(head!= null){
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
