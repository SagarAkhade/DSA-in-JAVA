// "static void main" must be defined in a public class.
/*
Link : https://www.geeksforgeeks.org/delete-last-occurrence-of-an-item-from-linked-list/
Q. Delete last occurrence of an item from linked list 
Input : 1 ,2 ,3, 4 , 5, 4, 4->null   value = 4;
Output : 1->2->3->4->5->4->null
Input : 1, 2, 3, 5, 2, 10->null   value = 2;
Output : 1->2->3->5->10->null
This solution handle all Test cases
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
    
    //Most Optimal Solution : Time Complexity-O(N) Space Complexity-O(1) 
    public ListNode deleteLastOccurrenceOfItem(ListNode head, int val) {
        if (head == null) {
          return null;
        }
        ListNode node = head;
        ListNode temp = null;

        while (node != null) {
          if (node.data == val) {
            temp = node;
          }
          node = node.next;
        }
        if (temp == null) {
          return head;
        }
        if (temp == head) {
          return head.next;
        }
        if (temp.next == null) {
          node = head;
          while (node.next.next != null) {
            node = node.next;
          }
          node.next = null;
          return head;
        }
        temp.data = temp.next.data;
        temp.next = temp.next.next;

        return head;
  }

    
    public void print(ListNode head){
        if(head == null){
            return;
        }
        ListNode  current = head;
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
        sll.head.next.next.next.next.next = new ListNode(4);
        sll.head.next.next.next.next.next.next = new ListNode(4);
        int val = 4;
        
        sll.print(sll.head);
        ListNode result = sll.deleteLastOccurrenceOfItem(sll.head, val);
        sll.print(result);
    }
}

// --------------
// Output : 
// 1->2->3->4->5->4->4->null
// 1->2->3->4->5->4->null
