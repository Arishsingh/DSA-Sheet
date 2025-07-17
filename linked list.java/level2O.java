//add at the first for dobly
class node{
    int data;
    node next;
    node prev;

    node(int value){
        data=value;
        next=null;
        prev=null;
    }
}
public class level2O {
public static void main(String[] args) {
    node n1 = new node(1);
    node n2 = new node(2);
    node n3 = new node(3);
    node n4 = new node(4);
    node n5 = new node(5);
    n1.next=n2;
    n2.prev=n1;
    n2.next=n3;
    n3.prev=n2;
    n3.next=n4;
    n4.prev=n3;
    n4.next=n5;
    n5.prev=n4;

    node n0 = new node(0);
    n0.next=n1;
    n0.prev=null;
    node head=n0;

    while(head!=null){
        System.out.print(head.data +" -> ");
        head = head.next;
    }
    System.out.println("null");

}
}
