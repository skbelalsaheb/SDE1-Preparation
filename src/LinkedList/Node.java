package LinkedList;

public class Node{
    int data;
    Node next;

    Node (){

    }
    Node (int data, Node next){
        this.data=data;
        this.next = next;
    }
    public static void printNode(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print("["+temp.data +"]"+" -> ");
            temp=temp.next;
        }
        System.out.print(" Null");
    }

    public static void createNode(int data, Node head){
//       head - > 1 ->   2 ->  Null
//       temp -> temp ->temp->
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next = new Node(data,null);
    }

    public static void insertAtBeg(Node head, int data){
//          1 -> 2 -> null
//        head- > newnode | 1 -> 2 -> null
        Node temp = head.next;
        Node newnode = new Node(data,null);
        head.next = newnode;
        newnode.next = temp;

    }


    public static void insertAtAnyPos(Node head, int data, int pos){

        Node temp = head;
//        Node - > 1- > 3-> 4 -> null
//        temp - > 1- > 3->500-> 4 -> null
        int cnt = 0;
        while (cnt < pos-1){
            temp=temp.next;
            cnt++;
        }
        Node temp1 = temp.next;
        Node newnode = new Node (data,null);
        temp.next = newnode;
        newnode.next = temp1;

    }
    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
