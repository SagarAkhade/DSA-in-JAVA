// "static void main" must be defined in a public class.
/*
Link : https://www.geeksforgeeks.org/detect-loop-in-a-linked-list/
Detect loop in a linked list
Input : 1->2->3->4->5  (5 linked to 2)
Output : Loop found
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
    
     //Most Optimal Solution : Time Complexity - O(N)  Space Complexity - O(1) 
    //Floyd’s Cycle-Finding Algorithm
    public boolean detectLoop(ListNode head){
        if(head==null || head.next==null){
            return false;
        }
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while(fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if(slowPtr==fastPtr){
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
        sll.head.next.next.next.next.next = sll.head.next;  //loop created
        
        if(sll.detectLoop(sll.head)){
            System.out.println("Loop Found");
        }
        else{
            System.out.println("Loop not Found");
        }
    }
}

--------
Output : 
Loop Found
