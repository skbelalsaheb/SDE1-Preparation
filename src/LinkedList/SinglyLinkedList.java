package LinkedList;
public class SinglyLinkedList {
    public static void main(String[] args) {
        Node head = new Node();
        int nodeArr[]={1,2,3,4,5};
        for (int a : nodeArr){

            head.createNode(head,a);
            System.out.println();
            Node.viewNode(head);

        }
//        head.next.next = new Node(10,null);
//        head.next.next.next = new Node(10,null);


        Node.insertAtBegining(head, new Node(100,null));
        System.out.println();
        Node.viewNode(head);





    }
}
