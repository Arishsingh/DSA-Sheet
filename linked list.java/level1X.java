//print
class Node{
    int data;
    Node next;
    Node(int value){
        data = value;
        next=null;
    }
}
public class level1X {
    public static void main(String[] args) {
        Node n1=new Node(1);
        Node n2=new Node(2);
        n1.next=n2;
         Node head = n1;

    Node temp = head;
while(temp != null){
    System.out.print(temp.data + " -> ");
    temp = temp.next;
}
System.out.println("null");

}
}
