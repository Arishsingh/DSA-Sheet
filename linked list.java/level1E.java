class Node{
    int  data;
    Node next;

    Node(int value){
        data=value;
        next=null;
    }
}
public class level1E {
    public static void main(String args[]){
Node node1 = new Node(5);
Node node2 = new Node(10);
Node node3 = new Node(15);
Node node4 = new Node(20);

//link
node1.next= node2;
node2.next=node3;
node3.next=node4;

Node temp = node1;
while(temp != null){
    System.out.print(temp.data + " -> ");
    temp = temp.next;

}
System.out.println("null");

    }

}
