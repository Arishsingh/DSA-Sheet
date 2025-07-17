
//deleted from end

class Node{
    int data;
    Node next;
    Node(int value){
        data=value;
        next=null;
    }
}
public class level1V {
    public static void main(String[] args) {
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);
        n1.next=n2;
        n2.next=n3;

        Node head=n1;
        if(head==null|| head.next==null){
            head= null;
        }else{
            Node temp = head;
            while(temp.next.next==null){
                head=head.next;
            }
            temp.next=null;

            //PRINT
            while(head!=null){
                System.out.print(head.data + " -> ");
                temp=temp.next;
            }
            System.out.println("null");


        }

    }
}
