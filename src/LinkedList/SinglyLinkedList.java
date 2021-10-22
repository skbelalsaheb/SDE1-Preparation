package LinkedList;

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
        Node head = new Node(2, null);
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

