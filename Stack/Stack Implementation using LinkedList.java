package com.company.A_7_Stack;
import java.util.EmptyStackException;

// Stack Implementation - LIFO(Last In First Out)
// Implementing Stack using LinkedList
public class A_7_Stack_1_Stack_Implementation {

    private ListNode top;  // instance variable that stores top
    private int length;

    // we are creating Stack using LinkedList
    private class ListNode{ // creating inner class for LinkedList
        int data;
        ListNode next;
        public ListNode(int data){  // This is constructor for our LinkedList
            this.data = data;
            this.next = null;
        }
    }

    public A_7_Stack_1_Stack_Implementation(){ // Constructor for stack
        this.top = null;
        this.length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){  //isEmpty() method check whether our Stack is empty or not
        return length == 0;
    }

    public void push(int data){  // Inserting Elements to our Stack
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }

    public int pop(){  // pop() method remove data from stack
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }

    public int peek(){ // peek() method gives the value stored by top i.e. the last inserted element
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.data;
    }

    public static void main(String[] args) {
        A_7_Stack_1_Stack_Implementation stack = new A_7_Stack_1_Stack_Implementation();  // Creating Object of the class
        stack.push(10);  //push(data) method for inserting Elements in Stack
        stack.push(15);
        stack.push(20);

        System.out.println(stack.peek());  // Print the last inserted element LIFO
        stack.pop();  // Remove last Inserted Element from Stack
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
    }
}
----------
Output - 
20
15
10
