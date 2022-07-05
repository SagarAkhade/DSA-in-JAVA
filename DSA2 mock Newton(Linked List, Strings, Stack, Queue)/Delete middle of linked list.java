// "static void main" must be defined in a public class.
/*
Q. Delete middle of linked list
(Asked to Me)
LinkedList: 1->2->3->4->5
Output: 1 2 4 5
*/
public class Main {
    public ListNode head;
    public static class ListNode{
        int data;
        ListNode next;
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public ListNode deletMiddleNode(ListNode head){
        if(head == null){
            return head;
        }
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while(fastPtr == null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }   
        ListNode temp = slowPtr.next;
        temp.next = temp.next.next;
        return head;
    }
    
    public void printList(ListNode head){
        if(head == null) {
            return;
        }
        ListNode current = head;
        while(current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Main list = new Main();
        list.head = new ListNode(1);
        list.head.next = new ListNode(2);
        list.head.next.next = new ListNode(3);
        list.head.next.next.next = new ListNode(4);
        list.head.next.next.next.next = new ListNode(5);
        
        list.printList(list.head);
        ListNode result = list.deletMiddleNode(list.head);
        list.printList(result);
    }
}
/*
----------------
Output : 
1->2->3->4->5->null
1->2->4->5->null
*/
