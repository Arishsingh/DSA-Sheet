class Node{
    int data;
    Node next;

    Node(int value){
        data = value;
        next = null;
    }
}
public class level1M {
    public static void main(String[] args) {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        node1.next = node2;

        Node head = node1;

        while(head!= null){
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
