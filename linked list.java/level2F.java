//Floyd’s cycle detection.
class node{
    int data;
    node next;
    node(int value){
        data=value;
        next=null;
    }
}
public class level2F {
    public static void main(String[] args) {
        node n1 = new node(1);
        node n2 = new node(2);
        node n3 = new node(3);
        node n4 = new node(4);
        node n5 = new node(5);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n2;
        node head = n1;

if(find(head)){
    System.out.println("loop exist");
}else{
    System.out.println("no loop");
}

        }
        static boolean find(node head){
            node fast = head;
            node  slow=head;
            while(fast!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;
                if(slow==fast){
                    return true;
                }
                }
                return false;
            }
    

    
}
