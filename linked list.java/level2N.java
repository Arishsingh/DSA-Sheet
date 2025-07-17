//add for singly 
class node{
    int data;
    node next;

    node(int value){
        data = value;
        next = null;
    }
}
public class level2N {
    public static void main(String[] args) {

node n1 = new node(1);
node n2 = new node(2);
node n3 = new node(3);

n1.next=n2;
n2.next=n3;

node n4 =new node(0);
n4.next=n1;
node head = n4;

while(head!=null){
    System.out.print(head.data + " -> ");
    head = head.next;
}
System.out.println("null");
}
}
