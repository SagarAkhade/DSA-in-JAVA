// "static void main" must be defined in a public class.
/*
Link : https://www.geeksforgeeks.org/find-the-second-largest-element-in-a-linked-list/
Q. Find the Second Largest Element in a Linked List
Input : List = 12 -> 35 -> 1 -> 10 -> 34 -> 1
Output : The second largest element is 34.
Input : List = 10 -> 5 -> 10
Output : The second largest element is 5.
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
    public int secondLargestElement(ListNode head){
        if(head==null || head.next==null){
            System.out.println("Invalid input");
            return -1;
        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        ListNode current = head;
        while(current != null){
            if(first < current.data){
                first = current.data;
            }
            current = current.next;
        }
        ListNode temp = head;
        while(temp != null){
            if(second<temp.data && temp.data != first){
                second = temp.data;
            }
            temp = temp.next;
        }
        return second;
    }
    
    public static void main(String[] args) {
        Main sll = new Main();
        sll.head = new ListNode(12);
        sll.head.next = new ListNode(35);
        sll.head.next.next = new ListNode(1);
        sll.head.next.next.next = new ListNode(10);
        sll.head.next.next.next.next = new ListNode(34);
        sll.head.next.next.next.next.next = new ListNode(1);
        
        System.out.println("The second largest element is " + sll.secondLargestElement(sll.head));
    }
}

------------
Output :
The second largest element is 34
