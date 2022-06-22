// "static void main" must be defined in a public class.
/*
Q. Length of loop
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
    public int lengthOfLoop(ListNode head){
        if(head == null){
            return 0;
        }
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while(fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if(slowPtr == fastPtr) {
                return length(slowPtr);
            }
        }
        return 0;
    }
    
    public int length(ListNode slowPtr){
        ListNode temp = slowPtr;
        int count = 1;
        while(temp.next != slowPtr){
            temp = temp.next;
            count++;
        }
        return count;
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
        
        System.out.println("The Length of Loop is : " + sll.lengthOfLoop(sll.head));
    }
}

-----------
Output : 
The Length of Loop is : 5
