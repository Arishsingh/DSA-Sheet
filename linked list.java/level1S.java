class node{
    int data;
    node next;

    node(int value){
    data = value;
    next=null;
    }
}
public class level1S {
    public static void main(String[] args) {
        node n1 = new node(10);
        node n2 = new node(20);
        node n3 = new node(40);

        node head = n1;

        int data=40;
        int position = 2;
        node newn=new node(data);

        if(position==0){
            newn.next=head;
            head=newn;
        }else{
            node temp = head;
            for(int i=0;temp!=null && i<position-1;i++){
                temp = temp.next;
            }
            if(temp==null){
                System.out.println("not found");
                return;
            }else{
                newn.next=temp.next;
                temp.next=newn;
            }
            //print
            node t = head;
            while( t != null){
                System.out.print(t.data+" -> ");
                t=t.next;
            }
            System.out.println("null");
        }

    }
}
