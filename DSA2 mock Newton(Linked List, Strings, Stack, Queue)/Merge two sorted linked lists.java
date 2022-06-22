// "static void main" must be defined in a public class.
/*
Link : https://www.geeksforgeeks.org/merge-two-sorted-linked-lists/
Q. Merge two sorted linked lists
Input : List1 : 5->10->15 , List2 : 2->3->20
Output : 2->3->5->10->15->20.
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
    
    public ListNode mergeTwoSortedList(ListNode A, ListNode B) {
        if(A == null) return B;
        if(B == null) return A;
         
        if(A.data < B.data) {
            A.next = mergeTwoSortedList(A.next, B);
            return A;
        }
        else {
            B.next = mergeTwoSortedList(A, B.next);
            return B;
        }
    }
    public void print(ListNode head) {
        if(head == null) {
            return;
        }
        ListNode current = head;
        while(current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        Main list1 = new Main();
        Main list2 = new Main();

        list1.head = new ListNode(5);
        list1.head.next = new ListNode(10);
        list1.head.next.next = new ListNode(15);
        
        list2.head = new ListNode(2);
        list2.head.next = new ListNode(3);
        list2.head.next.next = new ListNode(20);
        
        list1.print(list1.head);
        list2.print(list2.head);
        ListNode result = list1.mergeTwoSortedList(list1.head, list2.head);
        
        list1.print(result);
    }
}

// -----------
// Output : 
// 5->10->15->null
// 2->3->20->null
// 2->3->5->10->15->20->null
