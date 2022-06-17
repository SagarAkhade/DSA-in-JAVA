// "static void main" must be defined in a public class.
/*
Link : https://www.geeksforgeeks.org/move-occurrences-element-end-linked-list/
Move all occurrences of an element to end in a linked list
Input  : 1 -> 2 -> 2 -> 4 -> 3    ,  key = 2 
Output : 1 -> 4 -> 3 -> 2 -> 2
Input  : 6 -> 6 -> 7 -> 6 -> 3 -> 10  ,  key = 6
Output : 7 -> 3 -> 10 -> 6 -> 6 -> 6
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
    public void moveAllOccurenceLast(ListNode head, int key){
        if(head==null){
            return;
        }
        ListNode keyPointer = head;  //hoding the occurences of key
        ListNode current = head;     // traversing the LinkedList
        while(current!=null){
            if(current != keyPointer && current.data != key){       //swaping
                keyPointer.data = current.data;
                current.data = key;
                keyPointer = keyPointer.next;
            }
            if(keyPointer.data != key){
                keyPointer = keyPointer.next;
            }
            current = current.next;
        }
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
        sll.head = new ListNode(6);
        sll.head.next = new ListNode(6);
        sll.head.next.next = new ListNode(7);
        sll.head.next.next.next = new ListNode(6);
        sll.head.next.next.next.next = new ListNode(3);
        sll.head.next.next.next.next.next = new ListNode(10);
        int key = 6;
        
        sll.print(sll.head);
        sll.moveAllOccurenceLast(sll.head, key);
        sll.print(sll.head);
    }
}
--------
Output : 
6->6->7->6->3->10->null
7->3->10->6->6->6->null
