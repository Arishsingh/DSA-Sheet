//add at last
class Node {
    int data;
    Node next;

    Node(int value){
        data = value;
        next =  null;
    }
}
public class level1G {
    public static void main(String args[]){
        Node node1 = new Node(100);
        Node node2= new Node(200);
        Node node3 = new Node(300);
        //link 
        node1.next = node2;
        node2.next=node3;


        Node temp = node1;
        while(temp!= null){
            System.out.print( temp.data);
            temp = temp.next;

        }
        System.out.println("null");

    }

}
//add last is done as normal , no extra step
