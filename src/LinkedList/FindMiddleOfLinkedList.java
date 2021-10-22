package LinkedList;

public class FindMiddleOfLinkedList {
    public static void findMiddle (Node head){
        Node temp = head ;
        int cnt=0;

        while(temp.next!=null){
            temp = temp.next;
            cnt++;
        }
//        System.out.println(cnt);
        int mid = cnt/2;
        cnt=0;
        temp=head;
        while(cnt<=mid){
            temp=temp.next;
            cnt++;
        }
        System.out.println("Middle Data Is = "+temp.data);


    }
    public static void main(String[] args) {
        int arr [] = {9,8,7,6,4,3,1};
        Node head = new Node();
        for(int i=0;i<arr.length;i++){
            Node.createNode(arr[i],head);

        }
        Node.printNode(head.next);
        System.out.println();
        FindMiddleOfLinkedList.findMiddle(head);

    }
}

// Find Middle of  linked List -> O(n)
// Target - -> O(n/2) (Home Task)