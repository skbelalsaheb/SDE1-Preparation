package LinkedList;

public class FindMiddleOfLinkedList {
    public static void FindMiddle(Node head){
//        The first Approach 0 - n (Count)/2 = Mid Traverse
        Node temp = head;
        int cnt=0;
        while(temp.next!=null){
            temp=temp.next;
            cnt++;
        }
        temp=head;
        int z=0;
        while(z<=cnt/2){
            temp=temp.next;
            z++;
        }
        System.out.println("Middle Data Is  = "+temp.data);

    }
    public static void main(String[] args) {
        Node head = new Node();
        int nodeArr[]={1,2,3,4,5,6};
        for (int a : nodeArr){

            head.createNode(head,a);
            System.out.println();
            Node.viewNode(head);
            FindMiddleOfLinkedList.FindMiddle(head);
        }
    }
}
