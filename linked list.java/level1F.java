//Create 3 nodes manually and link them in reverse order (30 -> 20 -> 10).
// Print the list.

class Node{
    int data;
    Node next;

    Node(int value){
        data=value;
        next=null;
    }
}
public class level1F {
    public static void main(String args[]){
Node node1=new Node(10);
Node node2 = new Node(20);
Node node3 = new Node(30);

//linking
node3.next = node2;
node2.next = node1;

Node temp = node3;
while(temp!=null){
    System.out.print(temp.data + " -> ");
    temp = temp.next;
}
System.out.print("null");


    }
}
