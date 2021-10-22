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


        int arr [] = {1,2,4,5,6,7,8,9};
        Node head = new Node();
        for(int i=0;i<arr.length;i++){
            Node.createNode(arr[i],head);

        }
        Node.printNode(head.next);
        System.out.println();
        System.out.println("After inserting at begining");
        Node.insertAtBeg(head, 765);
        Node.printNode(head.next);
        System.out.println();
        System.out.println("After inserting at position 3");
        Node.insertAtAnyPos(head,500,3);
        Node.printNode(head.next);


    }
}

