class node{
    int data;
    node next;

    node(int value){
        data=value;
        next=null;
    }
}
public class level2P {
public static void main(String[] args) {
    node n1=new node(1);
    node n2=new node(2);
    node n3 = new node(3);
    node n4 = new node(4);
    node n5 = new node(5);

    n1.next=n2;
    n2.next=n3;
    n3.next=n4;
    n4.next=n5;

    node head = n1;

    node n0 = new node(0);
    n0.next=n1;
    head = n0;

    while(head!=null){
    System.out.print(head.data + " -> ");
    head=head.next;
    }
    System.out.println("null");
}
}