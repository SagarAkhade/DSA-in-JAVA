// "static void main" must be defined in a public class.
/*
Q.Find the middle of a given linked list
Link : https://www.geeksforgeeks.org/write-a-c-function-to-print-the-middle-of-the-linked-list/
1->2->3->4->5 then the output should be 3.
If there are even nodes, then there would be two middle nodes, we need to print the second middle element. 
For example, if the given linked list is 1->2->3->4->5->6 then the output should be 4. 
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
    public int middleNode(ListNode head){
        if(head==null){
            return -1;  //No middle Node
        }
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while(fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr.data;
    }
    
    //Printing List
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
        
        sll.print(sll.head);
        System.out.println("The middle node of LinkedList is : " + sll.middleNode(sll.head));
    }
}

----------
Output :
1->2->3->4->5->6->null
The middle node of LinkedList is : 4
