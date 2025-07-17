//reverse a node
class Node{
    int data;
    Node next;

    Node(int value){
        data=value;
        next=null;
    }
}
public class level2A {
    public static void main(String[] args) {
        Node n1 = new Node (10);
        Node n2= new Node (20);
        Node n3 = new Node (30);

        Node head = n1;

        Node prev=null;
        Node curr=head;
        Node next=null;
        while(curr!=null){
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;

        //print
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }
        System.out.println("null");


    }
}
