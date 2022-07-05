package com.company.A_8_Queue;
//import java.util.NoSuchElementException;
import java.util.*;

// Queue Implementation Using Linked List 
public class A_8_Queue_1_Queue_Implementation {
    private ListNode front;  // instance variable for front
    private ListNode rear;   // instance variable for rear
    private int length;

    public class ListNode{ // Inner class for ListNode
        int data;
        ListNode next;

        public ListNode(int data){ // Constructor for class ListNode
            this.data = data;
            this.next = null;
        }
    }

    public A_8_Queue_1_Queue_Implementation(){ // Construct for queue
        this.front = null;
        this.rear = null;
        this.length = 0;
    }

    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }

    // Enqueue method is for inserting the element at last of Queue
    public void enqueue(int data){
        ListNode temp = new ListNode(data);
        if(isEmpty()){
            front = temp;
        }
        else{
            rear.next = temp;
        }
        rear = temp;
        length++;
    }

    // dequeue() method will remove element from the front i.e. first inserted element FIFO
    public int dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue is already empty");
        }
        int result = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        length--;
        return result;
    }

    public int first(){ // first() method will print element at front of Queue
        if(isEmpty()){
            throw new NoSuchElementException("Queue is already empty");
        }
        return front.data;
    }

    public int last(){ // last() method will print element at rear of Queue
        if(isEmpty()){
            throw new NoSuchElementException("Queue is already empty");
        }
        return rear.data;
    }

    public void printQueue(){  // This method will print our Queue
        if(isEmpty()){
            return;
        }
        ListNode current = front;
        while(current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        A_8_Queue_1_Queue_Implementation queue = new A_8_Queue_1_Queue_Implementation(); // creating object of class
        queue.enqueue(10); // enqueue() will add element at last that is at rear
        queue.enqueue(15);
        queue.enqueue(20);
        queue.printQueue();
        //Output -  10-->15-->20-->null

        queue.dequeue(); //dequeue() method will remove element from front FIFO
        queue.printQueue();
        //Output -  15-->20-->null

        System.out.println(queue.first()); // first() method will print element at front
        System.out.println(queue.last()); // last() method will print element at rear
        //Output -  15 20
    }
}
