//search for a key
class Node{
    int data;
    Node next;
    Node(int value){
        data = value;
        next=null;
    }
}
public class level1Y {
    public static void main(String[] args) {
        Node n1=new Node(1);
        Node n2=new Node(2);
        n1.next=n2;
         Node head = n1;
        Node temp = head;
 
        int key=20;
        boolean found=false;
 while(temp!=null){
    if(temp.data==key){
        found = true;
    }
    temp = temp.next;
 }

}
}
