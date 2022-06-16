// "static void main" must be defined in a public class.
//check if a singly linked list is palindrome
//GFG Link : https://www.geeksforgeeks.org/function-to-check-if-a-singly-linked-list-is-palindrome/
//Input : R-A-D-A-R 
//Output : true
public class Main {
    public ListNode head;
    
    public static class ListNode{
        char data;
        ListNode next;
        public ListNode(char data){
            this.data = data;
            this.next = null;
        }
    }
    
    //Printing the LisNode 
    public void print(){  
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
    
    //BruteForce Solution - Time Complexity -> O(N)  Space Complexity -> O(N) 
    //Approach : put LinkedList in Stack(LIFO) and then compaire it again from start of LinkedList by removing to peek of stack
    public boolean isPalindromeBrute(){
        if(head==null || head.next == null){
            return true;
        }
        
        Stack<Character> stack = new Stack<>();
        ListNode current = head;
        while(current!=null){
            stack.push(current.data);
            current = current.next;
        }
        ListNode temp = head;
        while(temp!=null){
            if(temp.data != stack.peek()){
                return false;
            }
            stack.pop();
            temp = temp.next;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Main sll = new Main();
        sll.head = new ListNode('R');
        sll.head.next = new ListNode('A');
        sll.head.next.next = new ListNode('D');
        sll.head.next.next.next = new ListNode('A');
        sll.head.next.next.next.next = new ListNode('R');
        sll.print();
        
        if(sll.isPalindromeBrute()){
            System.out.println("It is Palindrome!");
        }
        else{
            System.out.println("It is not Palindrome!");
        }
    }
}
--------------
Output :
R->A->D->A->R->null
It is Palindrome!
