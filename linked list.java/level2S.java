class node{
    int data;
    node next;

    node (int value){
        data=value;
        next=null;
    }
}
public class level2S {
    public static void main(String[] args) {
        node n1 = new node(1);
        node n2 = new node(2);
        node n3 = new node(3);
        node n4 = new node(4);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;

        node head  = n1;

        if(head==null && head.next==null){
            head = null;
        }else{
            node temp  = head;
            while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next=null;

}
        while(head!=null){
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
}
