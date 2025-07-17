
//find the middle element
class node{
    int data;
    node next;

    node(int value){
        data=value;
        next=null;
    }
}
public class level2C {
    public static void main(String[] args) {
        node n1 = new node(1);
        node n2 = new node(2);
        node n3 = new node(3);
        node n4 = new node(4);

        n1=n2.next;
        n2=n3.next;
        n3=n4.next;
        node head = n1;

        node slow = head;
        node fast = head;

        while(fast != null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
    }
}
