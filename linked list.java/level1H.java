class Node{
    int data;
    Node next;

    Node(int value){
        data=value;
        next=null;
    }

}
public class level1H {
    public static void main(String args[]){
        Node node1=new Node(10);
        Node node2=new Node (20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);
        //link
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;

        int count =0;
        Node temp = node1;
        while(temp != null){
            count++;
            temp = temp.next;

        }

        System.out.println("count : " + count);

    }
}
