class Node{
    int data;
    Node next;

    Node(int value){
        data = value;
        next = null;
    }
}
public class level1N{
    public static void main(String[] args) {

        Node head = null;
        for (int i = 5; i >= 1; i--) {
            Node newNode = new Node(i);
            newNode.next = head;
            head = newNode;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
