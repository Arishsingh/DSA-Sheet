class Node{
    int data;
    Node next;

    Node(int value){
        data= value;
        next= null;
    }
}
public class level1L {
    public static void main(String[] args) {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
//link
        node1.next=node2;

        Node node3 = new Node(2);
        Node node4 = new Node(5);

//link
        node4.next=node1;
        node3.next=node4;

        Node head = node3;

        while(head != null){
            System.out.print(head.data + " ->");
            head = head.next;
        }
System.out.println("null");


    }
}
