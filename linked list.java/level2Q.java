class node{
    int data;
    node next;

    node (int value){
        data=value;
        next=null;
    }
}
public class level2Q {
    public static void main(String[] args) {
        node n1 = new node(1);
        node n2 = new node(2);
        node n3 = new node(3);
        node n4 = new node(4);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;

        node n5 = new node(5);
    n4.next=n5;

    node head = n1;
    while(head!=null){
        System.out.print(head.data + " -> ");
        head = head.next;
    }
    System.out.println("null");
    }
}
