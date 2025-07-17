class node{
    int data;
    node next;

    node(int value){
    data = value;
    next=null;
    }
}

public class level2G {
    public static void main(String[] args) {
        node n1 = new node(1);
        node n2 = new node(2);
        node n3 = new node(3);
        node n4 = new node(4);
        node n5 = new node(5);
        node n6 = new node(6);
        node n7 = new node(7);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;
        n7.next=n3;

        node head= n1;
        if(find(head)){
            System.out.println("loop exist");
        }else{
            System.out.println("loop do not exist");
        }
    }
        static boolean find(node head){
         node fast = head;
         node slow= head;
         while(fast != null && fast.next != null){
            slow = slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
            return false;

    }
}
