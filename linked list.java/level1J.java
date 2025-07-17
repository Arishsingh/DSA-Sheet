class Node{
    int data;
    Node next;

    Node(int value){
        data=value;
        next=null;
    }
}
public class level1J {
    public static void main(String[] args) {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);

        node1.next =  node2;
        node2.next= node3;

        Node newnode1 = new Node(0);
        newnode1.next = node1;
        Node head = newnode1;

        while(head != null){
            System.out.print( head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
