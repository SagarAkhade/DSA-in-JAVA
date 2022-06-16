// "static void main" must be defined in a public class.
//Implement Stack using LinkedList
//Operations included - push(int data), pop(), peek(), isEmpty(), length();

import java.util.EmptyStackException;
public class Main {
    public ListNode top;
    public int length;
    
    public class ListNode{
        int data;
        ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public Main(){    //Constructor for Stack
        this.top = null;
        this.length = 0;
    }
    
    public int length(){
        return length;
    }
    
    public boolean isEmpty(){
        return length==0;
    }
    
    public void push(int value){
        ListNode temp = new ListNode(value);
        temp.next = top;
        top = temp;
        length++;
    }
    
    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }
    
    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.data;
    }
    
    public static void main(String[] args) {
        Main stack = new Main();
        stack.push(10);  //push(value) -> add element to stack LIFO
        stack.push(15);
        stack.push(20);
        
        System.out.println(stack.peek()); //peek() -> print element to the top of stack LIFO
        stack.pop();  //peek() -> remove element to the top of stack LIFO
        System.out.println(stack.peek());
    }
}

------
Output :
20
15
