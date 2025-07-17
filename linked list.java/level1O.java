class Node{
    int data;
    Node next;

    Node(int value){
        data= value;
        next= null;
    }
}
public class level1O {
    public static void main(String[] args) {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);



//link
node1.next = node2;
node2.next=node3;
Node node4 = new Node(40);
node3.next = node4;

Node node5 = new Node(0);
node5.next = node1;

Node head = node5;

while(head != null){
    System.out.print(head.data + " -> ");
    head = head.next;

}
System.out.println("null");
    }
}
