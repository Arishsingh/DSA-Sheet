//length of a linked list
class Node{
    int data;
    Node next;
    Node(int value){
        data = value;
        next=null;
    }
}
public class level1Z {
    public static void main(String[] args) {
        Node n1=new Node(1);
        Node n2=new Node(2);
        n1.next=n2;
            Node head = n1;
            Node temp = head;
int count = 0;
while(temp != null){
    count++;
    temp= temp.next;
}
System.out.print(count);

}
}
