class node {
    int data;
    node next;

    node(int value){
        data = value;
        next = null;
    }
}
    public class A1{
        public static void main(String[] args) {
            node n1 = new node(1);
            node n2 = new node(2);
            node n3 = new node(3);
            node n4 = new node(4);

            node temp = n1;

            while(temp != null){
        System.out.println(temp.data);
        temp = temp.next;
            }
            System.out.println("null");

        }
    }
