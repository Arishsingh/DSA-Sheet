// adding node at last
class Node{
    int data;
    Node next;

        Node(int value){
        data = value;
        next=null;
    }
}
public class level1C {
    public static void main(String[] args) {

    Node node1 = new Node(10);
    Node node2 = new Node(20);
    Node node3 = new Node(30);
    Node node4 = new Node(40);
    Node node5 = new Node(50);

    //linking
    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = node5;

    // adding new node at the end
    Node newNode = new Node(60);
    Node temp = node1;
    while(temp.next != null){
        temp = temp.next;
    }
    temp.next = newNode;

    // print

        System.out.print(temp.data + " ->");
        System.out.print(temp.next);




}
}
