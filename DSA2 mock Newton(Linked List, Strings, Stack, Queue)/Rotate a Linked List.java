// "static void main" must be defined in a public class.
/*
Link : https://www.geeksforgeeks.org/rotate-a-linked-list/#:~:text=To%20rotate%20the%20linked%20list,th%20node%2C%20and%20last%20node.
Q. Rotate a linked list
(Asked To Me)
Given a singly linked list, rotate the linked list counter-clockwise by k nodes. Where k is a given positive integer. 
For example, if the given linked list is 10->20->30->40->50->60 and k is 4, the list should be 
modified to 50->60->10->20->30->40. Assume that k is smaller than the count of nodes in a linked list.
*/
public class Main {
    public ListNode head;
    public static class ListNode{
        int data;
        ListNode next;
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public void rotateList(int k) {
        if(k == 0){
            return;
        }
        ListNode temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        temp = head;
            
        for(int i = 0; i < k - 1; i++){
            temp = temp.next;
        } 
        head = temp.next;
        temp.next = null;    
    }

    public void print(ListNode head) {
        if(head == null) {
            return;
        }
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        Main list = new Main();
        list.head = new ListNode(10);
        list.head.next = new ListNode(20);
        list.head.next.next = new ListNode(30);
        list.head.next.next.next = new ListNode(40);
        list.head.next.next.next.next = new ListNode(50);
        list.head.next.next.next.next.next  = new ListNode(60);
        
        int k = 4;
        list.print(list.head);
        list.rotateList(k);
        list.print(list.head);
    }
}
/*
--------------
Output : 
10->20->30->40->50->60->null
50->60->10->20->30->40->null
*/
