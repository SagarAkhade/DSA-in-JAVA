// "static void main" must be defined in a public class.
/*
Reverse a linked list
Link : https://www.geeksforgeeks.org/reverse-a-linked-list/
Input: Head of following linked list 
1->2->3->4->NULL 
Output: Linked list should be changed to, 
4->3->2->1->NULL
Input: Head of following linked list 
1->2->3->4->5->NULL 
Output: Linked list should be changed to, 
5->4->3->2->1->NULL
Input: NULL 
Output: NULL
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
    public ListNode reverse(ListNode head){
        if(head==null){
            return head;
        }    
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while(current!=null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
    // Printing the List 
    public void print(ListNode head){
        if(head==null){
            System.out.println("null");
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
        
        sll.print(sll.head);
        ListNode rev = sll.reverse(sll.head);
        sll.print(rev);
    }
}
-------------
Output - 
1->2->3->4->5->null
5->4->3->2->1->null
