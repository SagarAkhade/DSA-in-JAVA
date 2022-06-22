// "static void main" must be defined in a public class.
/*
Q. Delete nth node from End 
Input : 1->2->3->4->5->6->null position=2
Output : 1->2->3->4->6->null 
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
    
    public ListNode deleteNodeFromEnd(ListNode head, int position){
        if(head == null) {
            return head;
        }
        ListNode previous = head;
        ListNode refPtr = head;
        ListNode mainPtr = head;
        int count = 0;
        while(count < position) {
            refPtr = refPtr.next;
            count++;
        }
        while(refPtr != null) {
            previous = mainPtr;
            mainPtr = mainPtr.next;
            refPtr = refPtr.next;
        }
        previous.next = mainPtr.next;
        return head;
    }
    
    public void print(ListNode head){
        if(head == null){
            return;
        }
        ListNode current = head;
        while(current != null){
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
        
        sll.print(sll.head);
        sll.deleteNodeFromEnd(sll.head, 2);
        sll.print(sll.head);
    }
}

-----------
Output : 
1->2->3->4->5->6->null
1->2->3->4->6->null
