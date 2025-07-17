//adding node at start
class Node{
    int data;
    Node next;

    Node(int value){
        data=value;
        next=null;
    }
}
public class level1D {
    public static void main(String args[]){
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);

        // link
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;

        // create a new node
        Node newnode = new Node(5);
       // point new node to current head
        newnode.next = node1;
       //updat head to new node
        Node head = newnode;

       //print
        Node temp = head;
        while(temp != null){
        System.out.print(temp.data +" -> ");
        temp = temp.next;
        }
        System.out.println("null");
    }
}
