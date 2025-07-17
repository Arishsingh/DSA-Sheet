class Node{
    int data;
    Node next;

    Node(int value){
        data = value;
        next = null;
    }
}
public class level1P{
    public static void main(String[] args) {
    Node node1 = new Node(10);
    Node node2 = new Node(20);
    Node node3 = new Node(30);
    Node node4 = new Node(40);
    Node node5 = new Node(50);

    node1.next = node2;
    node2.next=node3;
    node3.next=node4;
    node4.next=node5;
    Node  head= node1;

    int data=100;
    int position=2;
    Node newnode1=new Node(data);

    if(position ==0){
        newnode1.next=head;
        head=newnode1;
    }else{
        Node temp = head;
        for(int i =0; temp!= null&&i<position-1;i++){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("position out of bounds");
            return;
        }
        newnode1.next=temp.next;
        temp.next=newnode1;
    }
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }
    System.out.println("null");
}
}