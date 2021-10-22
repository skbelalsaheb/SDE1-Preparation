package LinkedList;
public class Node{
    int data;
    Node next;
    Node(){

    }
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    public void createNode(Node head,int data){
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next = new Node (data,null);
//        return temp;
    }
    public static void insertAtBegining(Node head, Node newnode){
        Node nxt = head.next;
        head.next=newnode;
        newnode.next=nxt;
    }
    public static void viewNode(Node node){
        Node temp = node.next;
        while(temp!=null){
            System.out.print(" ["+temp.data + "] "+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }
//    1 - (obj)->2 -> Null

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
