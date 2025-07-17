class node{
    int data;
    node next;

    node(int value){
    data=value;
    next=null;
    }
}
public class level1R {
public static void main(String args[]){
    node  node1 = new node(1);
    node node2 = new node(3);
    node node3 = new node(5);
    node node4= new node(7);
    node head = node1;

int data = 9;
int position = 4;
node newnode = new node(data);

if(position ==0){
newnode.next=head;
head=newnode;
}else{
    node  temp = head;
    for(int i =0; temp!=null && i<position-1;i++){
    temp=temp.next;
    }
    if(temp==null){
        System.out.println("position not found");
        return;
    }
    newnode.next=temp.next;
    temp.next=newnode;
}
node t = head;
while(t!=null){
    System.out.print(t.data + " -> ");
    t=t.next;
}
System.out.println("null");
}
}
