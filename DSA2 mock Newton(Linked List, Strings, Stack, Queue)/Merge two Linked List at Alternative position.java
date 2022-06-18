// "static void main" must be defined in a public class.
/*
Link : https://www.geeksforgeeks.org/merge-a-linked-list-into-another-linked-list-at-alternate-positions/
Q. Merge two Linked List at Alternative position
Input : List1 :  5->7->17->13->11  List2 : 12->10->2->4->6 
Output : 5->12->7->10->17->2->13->4->11->6
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
    
    //Most Optimal Solution Time Complexity O(N)  Space Complexity O(1) 
    public ListNode mergeAlternatively(ListNode head1, ListNode head2){
        if(head1==null || head2 == null){
            return head1;
        }
        ListNode first1 = head1;
        ListNode first2 = null;
        ListNode second1 = head2;
        ListNode second2 = null;
        while(true){
            first2 = first1.next;
            second2 = second1.next;

            first1.next = second1;
            second1.next = first2;
            
            first1 =  first2;
            second1 = second2;
            if(first1==null || second1==null){
                break;
            }
        }
        return head1;
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
        Main list1 = new Main();
        Main list2 = new Main();
        
        list1.head = new ListNode(5);
        list1.head.next = new ListNode(7);
        list1.head.next.next  = new ListNode(17);
        list1.head.next.next.next  = new ListNode(13);
        list1.head.next.next.next.next  = new ListNode(11);
        
        list2.head = new ListNode(12);
        list2.head.next = new ListNode(10);
        list2.head.next.next  = new ListNode(2);
        list2.head.next.next.next  = new ListNode(4);
        list2.head.next.next.next.next  = new ListNode(6);
        
        
        list1.print(list1.head);
        list2.print(list2.head);
        ListNode result = list1.mergeAlternatively(list1.head, list2.head);
        list1.print(result);
    }
}

---------------
Output : 
5->7->17->13->11->null
12->10->2->4->6->null
5->12->7->10->17->2->13->4->11->6->null
