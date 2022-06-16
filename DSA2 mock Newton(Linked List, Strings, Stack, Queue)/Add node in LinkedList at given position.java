// "static void main" must be defined in a public class.
/*
Q. Add node in LinkedList at given position
Input: 3->5->8->10, data = 2, position = 2
Output: 3->2->5->8->10
Input: 3->5->8->10, data = 11, position = 5
Output: 3->5->8->10->11 
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
    
    //Optimal Solution : Time Complexity - O(N)  Space Complexity - O(1) 
    public ListNode insertAtGivenPosition(ListNode head, int value, int position){
        if(head==null){
            return head;
        }
        ListNode node = new ListNode(value);
        ListNode previous = head;
        int count = 1;
        while(count < position-1){
            previous = previous.next;
            count++;
        }
        ListNode current = previous.next;
        previous.next = node;
        node.next = current;
        
        return head;
    }
    
    public void print(ListNode head){
        if(head==null){
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
        sll.head = new ListNode(3);
        sll.head.next = new ListNode(5);
        sll.head.next.next = new ListNode(8);
        sll.head.next.next.next = new ListNode(10);
        sll.print(sll.head);
        
        int value = 2;
        int position = 2;
        ListNode insertNode = sll.insertAtGivenPosition(sll.head, value, position);
        sll.print(insertNode);
    }
}
--------
Output :
3->5->8->10->null
3->2->5->8->10->null
