class Node{
    int data;
    Node next;

    Node(int value){
        data = value;
        next=null;
    }
}
public class level1A{
    public static void main(String args[]){
        Node node1 = new Node(10);

        System.out.println("data : " + node1.data);
        System.out.println("Next : " + node1.next);



    }
}
