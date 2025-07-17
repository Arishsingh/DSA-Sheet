class Node{
    int  data;
    Node next;

    Node(int value){
    data = value;
    next = null;
    }
}
public class level1B {


public static void main(String args[]){
 Node node1 = new Node(1);
 Node node2 = new Node(2);
 Node node3 = new Node(3);

 //link
 node1.next = node2;
 node2.next=node3;

 Node temp = node1;
 while(temp!= null){
    System.out.print(temp.data + " -> ");
    temp = temp.next;
 }
 System.out.println("null");
}
}