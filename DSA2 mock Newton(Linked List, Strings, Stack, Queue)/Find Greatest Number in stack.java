// "static void main" must be defined in a public class.
/*
Find Greatest Number in stack
Input : 10 15 20 25 50 30 
Output : The Greatest number in stack is : 50
*/
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
    
    //To find greatest Number in Stack
    public int greatestNumInStack(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        ListNode temp = top;
        int maxNum = top.data;
        while(temp != null){
            if(maxNum < temp.data){
                maxNum = temp.data;
            }
            temp = temp.next;
        }
        return maxNum;
    }
    
    public static void main(String[] args) {
        Main stack = new Main();
        stack.push(10);  //push(value) -> add element to stack LIFO
        stack.push(15);
        stack.push(20);
        stack.push(25);
        stack.push(50);
        stack.push(30);
        
        System.out.println("The Greatest number in stack is : " + stack.greatestNumInStack());
    }
}

------
Output :
The Greatest number in stack is : 50
