//reverse a node
class node{
    int data;
    node next;

    node(int value){
        data=value;
        next=null;
    }
}
public class level2B {
public static void main(String[] args) {
    node n1=new node(10);
    node n2 = new node(20);
    node n3= new node(30);

    n1.next=n2;
    n2.next=n3;
    node head=n1;

    node prev=null;
    node curr=head;
    node next=null;

    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    head=prev;

    //print
    node temp=head;
    while(temp!=null){
        System.out.print(temp.data + " -> ");
        temp=temp.next;
    }
    System.out.println("null");
}
}
