// "static void main" must be defined in a public class.
/*
Link : https://www.geeksforgeeks.org/reverse-a-list-in-groups-of-given-size/
Reverse a Linked List in groups of given size
Input: 1->2->3->4->5->6->7->8->NULL, K = 3 
Output: 3->2->1->6->5->4->8->7->NULL 
Input: 1->2->3->4->5->6->7->8->NULL, K = 5 
Output: 5->4->3->2->1->8->7->6->NULL
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
    
    //Optimal Solution - Time Complexity - O(N)  Space Complexity - O(1) 
    public ListNode reverse(ListNode head, int k){
        if(head==null || head.next==null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        int count = 0;
        while(count < k && current!=null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
            count++;
        }
         if (next != null){
             head.next = reverse(next, k);
         }
        return previous;
    }
    
    //Printing the List
     public void print(ListNode head){
        if(head==null){
            return;
        }
        ListNode current = head;
        while(current!=null){
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
        sll.head.next.next.next.next.next.next.next = new ListNode(8);
        
        sll.print(sll.head);
        
        int k = 3;
        ListNode rev = sll.reverse(sll.head, k);
        sll.print(rev);
    }
}
