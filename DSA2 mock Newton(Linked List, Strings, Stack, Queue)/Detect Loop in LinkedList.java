// "static void main" must be defined in a public class.
/*
Q. Detect Loop in LinkedList
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
    
    //Getting length of loop
    public boolean detectLoop(ListNode head){
        if(head == null){
            return false;
        }
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while(fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if(slowPtr == fastPtr) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        Main sll = new Main();
        sll.head = new ListNode(1);
        sll.head.next = new ListNode(2);
        sll.head.next.next = new ListNode(3);
        sll.head.next.next.next = new ListNode(4);
        sll.head.next.next.next.next = new ListNode(5);
        sll.head.next.next.next.next.next = new ListNode(6);
        sll.head.next.next.next.next.next.next = sll.head.next;
        
        System.out.println("Is loop present : " + sll.detectLoop(sll.head));
    }
}

-----------
Output : 
Is loop present : true
