package com.company.A_6_LinkedList;
import java.util.NoSuchElementException;

// Doubly Linked List Implementation
public class A_6_Linked_List_2_DoublyLinkedList {
    private ListNode head;  // Instance variable for head hold first node
    private ListNode tail;  // Instance variable for tail hold last node
    private int length;

    public class ListNode{ // Creating Inner class for DLL
        int data;
        ListNode next;
        ListNode previous;


        public ListNode(int data){  // Constructor of inner class
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    public A_6_Linked_List_2_DoublyLinkedList(){  // Constructor for DLL
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty(){  // this method check whether DLL is empty or not
        return length == 0; // also can be head == null
    }

    public int length(){  // this method gives length of DLL
        return length;
    }

    // Printing DLL in Forward direction
    public void displayForward(){
        if(head == null){
            return;
        }
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Printing DLL in Backward direction
    public void displayBackward(){
        if(tail == null){
            return;
        }
        ListNode temp = tail;
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.previous;
        }
        System.out.println("null");
    }

    // Here we are inserting element in start of DLL
    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            tail = newNode;
        }
        else{
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    //Here we are inserting element at last of DLL
    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            head = newNode;
        }
        else{
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        length++;
    }

    // Here we are deleting first node of DLL
    public ListNode deleteFirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = head;
        if(head == tail){
            tail = null;
        }
        else{
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        length--;
        return temp;
    }

    // Here we are deleting the Last node of DLL
    public ListNode deleteLast(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = tail;
        if(head == tail){
            head = null;
        }
        else{
            tail.previous.next = null;
        }
        tail = tail.previous;
        temp.previous = null;
        length--;
        return temp;
    }


    public static void main(String[] args) {
        A_6_Linked_List_2_DoublyLinkedList dll = new A_6_Linked_List_2_DoublyLinkedList();
        /*
        // Displaying DLL in forward and backward direction
        dll.insertLast(1);
        dll.insertLast(10);
        dll.insertLast(15);
        dll.insertLast(25);

        // Displaying DLL in forward direction
        dll.displayForward();
        //Output : 1 --> 10 --> 15 --> 25 --> null
        // Displaying DLL in Backward direction
        dll.displayBackward();
        //Output : 25 --> 15 --> 10 --> 1 --> null
        */

        /*
        //Here we are inserting node at start of DLL
        dll.insertFirst(1);
        dll.insertFirst(10);
        dll.insertFirst(15);
        dll.displayForward();
        //Output : 15 --> 10 --> 1 --> null
        */

        /*
        //Here we are inserting element at last of DLL
        dll.insertLast(1);
        dll.insertLast(10);
        dll.insertLast(15);
        dll.displayForward();
        //Output :  1 --> 10 --> 15 --> null
        */

        /*
        // Here we are deleting first node of DLL
        dll.insertLast(1);
        dll.insertLast(10);
        dll.insertLast(15);
        dll.displayForward();
        dll.deleteFirst();
        dll.displayForward();
        //Output : 1 --> 10 --> 15 --> null
        //         10 --> 15 --> null
        */

        // Here we are deleting the Last node of DLL
        dll.insertLast(1);
        dll.insertLast(10);
        dll.insertLast(15);
        dll.displayForward();
        dll.deleteLast();
        dll.displayForward();
        // Output : 1 --> 10 --> 15 --> null
        //          1 --> 10 --> null
    }
}
