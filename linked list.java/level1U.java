//deleted from begining

class Node{
    int data;
    Node next;

    Node(int value){
    data = value;
    next=null;
    }
}
public class level1U {
    public static void main(String[] args) {
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);
            n1.next=n2;
            n2.next=n3;
        Node head = n1;

        if(head!=null){
            head=head.next;
        }

        //print
        while(head!=null){
            System.out.println(head.data + " -> ");
            head=head.next;

        }
        System.out.println("null");


    }
}
