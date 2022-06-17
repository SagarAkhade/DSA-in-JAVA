// "static void main" must be defined in a public class.
/*
Q. Implement Doubly Linked List
*/
public class Main {
    public ListNode head;
    public ListNode tail;
    public int length;
    
    public static class ListNode{
        int data;
        ListNode previous;
        ListNode next;
        public ListNode(int data){
            this.data = data;
            this.previous = null;
            this.next = null;
        }
    }
    
    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        if(head==null){
            tail = newNode;
        }
        else{
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }
    public void print(ListNode head){
        if(head==null){
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
        Main dll = new Main();
        dll.insertFirst(5);
        dll.insertFirst(4);
        dll.insertFirst(3);
        dll.insertFirst(2);
        dll.insertFirst(1);
        dll.print(dll.head);
    }
}

----------
Output : 
1->2->3->4->5->null
