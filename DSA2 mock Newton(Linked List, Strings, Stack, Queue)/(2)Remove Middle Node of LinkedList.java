// "static void main" must be defined in a public class.
/*
Q. Remove Middle Node of LinkedList
(Asked to me)
*/

public class Main {
    public ListNode head;
    
    public static class ListNode{
        int data;
        ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    //Remove Middle index
    public void removeMiddle(ListNode head){
        if(head == null) {
            return;
        }
        ListNode previous = head;
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while(fastPtr != null && fastPtr.next != null) {
            previous = slowPtr;
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        previous.next = slowPtr.next;
    }
    
    public void print(ListNode head) {
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
        Main sll = new Main();
        sll.head = new ListNode(1);
        sll.head.next = new ListNode(2);
        sll.head.next.next = new ListNode(3);
        sll.head.next.next.next = new ListNode(4);
        sll.head.next.next.next.next = new ListNode(5);
        sll.head.next.next.next.next.next = new ListNode(6);
        sll.head.next.next.next.next.next.next = new ListNode(7);
        
        sll.print(sll.head);
        sll.removeMiddle(sll.head);
        sll.print(sll.head);
    }
}

-----------
Output : 
1->2->3->4->5->6->7->null
1->2->3->5->6->7->null
