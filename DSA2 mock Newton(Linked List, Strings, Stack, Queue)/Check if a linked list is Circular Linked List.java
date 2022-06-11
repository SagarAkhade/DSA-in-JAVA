// "static void main" must be defined in a public class.
//Check if a linked list is Circular Linked List
// Link : https://www.geeksforgeeks.org/check-if-a-linked-list-is-circular-linked-list/?ref=lbp
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
    
    public boolean isCircular(ListNode head){
        if(head==null){
            return true;
        }
        ListNode temp = head.next;
        while(temp!=null && temp!=head){
            temp = temp.next;
        }
        return temp==head;
    }
    
    public static void main(String[] args){
        Main sll = new Main();
        sll.head = new ListNode(1);
        sll.head.next = new ListNode(2);
        sll.head.next.next = new ListNode(3);
        sll.head.next.next.next = sll.head;
        
        System.out.println((sll.isCircular(sll.head)) ? "Yes" : "No");
    }
}
--------
Output : 
Yes
