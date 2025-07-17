


class node{
    int data;
    node next;

    node(int value){
    data = value;
    next=null;
    }
}

public class level2I {
    public static void main(String[] args) {
        node n1 = new node(50);
        node n2 = new node(60);
        node n3 = new node(70);
        node n4 = new node(80);
        node n5 = new node(90);
        node n6 = new node(100);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n3;
    
        node head = n1;
        if(find(head)){
            System.out.println("loop found");
        }else{
            System.out.println("loop not found");
        }

    }

    static boolean find (node head){
node fast = head;
node slow = head;
boolean isloop=false;

while(fast!=null&& fast.next!= null){
    slow = slow.next;
    fast = fast.next.next;
    if(fast == slow){
        isloop = true;
        break;
    }
    }
    if(isloop){
        slow=head;
        while(slow!= head){
            slow=slow.next;
            fast = fast.next;
        }
        node ptr = fast;
        while(ptr.next!= slow){
            ptr=ptr.next;
        }
        ptr.next=null;
        return true;
    }
    return false;
}

}