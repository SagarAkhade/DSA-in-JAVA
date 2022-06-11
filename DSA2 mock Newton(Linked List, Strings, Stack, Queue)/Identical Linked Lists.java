// "static void main" must be defined in a public class.
/*
Identical Linked Lists
Link :  https://www.geeksforgeeks.org/identical-linked-lists/#:~:text=Two%20Linked%20Lists%20are%20identical,%3E3)%20are%20identical.%20.
 Input : List1 : 1->2  List2 : 1->2 
Output : Yes
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
    
    public boolean isEqual(ListNode head1, ListNode head2){
        if(head1==null && head2==null){
            return true;
        }
        while(head1!=null && head2!=null){
            if(head1.data != head2.data){
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return (head1==null && head2==null);
    } 
    
    public static void main(String[] args) {
        Main list1 = new Main();
        Main list2 = new Main();
        Main answer = new Main();
        
        list1.head = new ListNode(1);
        list1.head.next = new ListNode(2);
        
        list2.head = new ListNode(1);
        list2.head.next = new ListNode(2);
        
        if(answer.isEqual(list1.head, list2.head)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
---------
Output -
Yes
