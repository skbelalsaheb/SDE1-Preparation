// Single Linked List

class Node{
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

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}


public class SinglyLinkedList {
    public static void main(String[] args) {
////         Head Node
//        Node head = new Node();
////         head.data= 10;
//         head.next = null;
//
//        Node n1 = new Node();
//        n1.data=20;
//        n1.next = null;
//
//        Node n2 = new Node();
//        n2.data=27;
//        n2.next = null;
//
//
//        Node n3 = new Node();
//        n3.data=21;
//        n3.next = null;
//
//        head.next = n1;
//        n1.next   = n2;
//        n2.next  = n3;
//
//
//        System.out.println(head);
//        Node.printNode(head);
        Node head = new Node(100,null);
        Node n1 = new Node(40,null);
        head.next=n1;
        Node.printNode(head);

//        int arr [] = {1,2,4,5,6,7,8,9};


    }
}

