package com.company.A_6_LinkedList;
import java.util.List;

// This program is for representation of Singly Linked List
public class A_6_Linked_List_1_SinglyLinkedList {

    private ListNode head;   // Here we create Instance Variable. This Head holds our list

    private static class ListNode{     // Here is inner class
        int data;         // any Generic Type - here we store data
        ListNode next;   // Here ListNote next pointing for next node

        private ListNode(int data){   // We provide Constructor here which will provide data
            this.data = data;         // For taking data
            this.next = null;         // Pointing to next address of Singly Linked List
        }
    }

    public void display(){   // Creating Method for printing Singly Linked List elements
        ListNode current = head;
        while( current != null ){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int length(){   // Creating Method for getting length of Singly Linked list
        if(head == null){
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    public void insertFirst(int value){   // This method will insert node at beginning
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int value){    // This method will insert node at end
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while( current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public void insert(int position, int value){   // This Method will insert the node at any given position
        // 1 --> 4 --> 5    Assuming Singly Linked List
        // And we want to insert value 6 at position 2
        // 1--> 6 --> 4 --> 5   Final Linked list
        ListNode node = new ListNode(value);
        if(position == 1){     // if part check, if position is 1
            node.next = head;
            head = node;
        }
        else{                 // if part can put node at any required position
            ListNode previous = head;
            int count = 1;   // traverse to position-1
            while(count < position-1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = node;
            node.next = current;
        }
    }

    public ListNode deleteFirst(){   // This Method to delete first Node of SLL
        if(head == null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;     // Here we are returning deleted node
    }

    public ListNode deleteLast(){    // This Method to delete Last Node of SLL
        if(head == null || head.next == null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while(current.next != null){
            previous = current;
            current = current.next;
        }
        previous.next = null;  //this break chain
        return current;
    }

    public void delete(int position){   // This Method will delete node at given position in SLL
        // position is valid and starting from 1
        // 3 -> 4 -> 7 -> 8 -> 9 -> null
        if(position == 1){
            head = head.next;
        }
        else{
            ListNode previous = head;
            int count = 1;
            while(count < position -1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }
    }

    public void deleteNode(int key){  // This Method will remove Key from SLL
        ListNode current = head;
        ListNode temp = null;
        if(current != null && current.data == key){ // We found key at head
            head = current.next;
            return;
        }
        while(current != null && current.data != key){
            temp = current;
            current = current.next;
        }
        if(current == null){
            return;
        }
        temp.next = current.next;
    }

    public ListNode insertInSortedList(int value){   // This Method insert Node in Sorted List
        ListNode newNode = new ListNode(value);
        if(head == null){
            return newNode;
        }
        ListNode current = head;
        ListNode temp = null;
        while(current != null && current.data < newNode.data){
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
        return head;
    }

    public void removeDuplicates(){  // This Method remove Duplicates from Sorted SLL
        if(head == null){
            return;
        }
        ListNode current = head;
        while(current != null && current.next != null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }
    }

    public boolean find(ListNode head, int searchKey){  // This Method check is Key present in SLL or not
        if(head == null){
            return false;
        }
        ListNode current = head;
        while(current != null){
            if(current.data == searchKey){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public ListNode reverse(ListNode head){  /// This Method will Reverse SLL
        if(head == null){
            return head;
        }
        ListNode current = head;
        ListNode previous  = null;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public void printList(ListNode head){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Here we are finding the middle of SLL
    public ListNode getMiddleNode(){
        if(head==null){
            return null;
        }
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while(fastPtr != null && fastPtr.next!=null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    // Finding nth node from end SLL
    public ListNode getNthNodeFromEnd(int n){
        if(head == null){
            return head;
        }
        if(n<=0){
            throw new IllegalArgumentException("Invalid value");
        }
        ListNode mainPtr = head;
        ListNode refPtr = head;
        int count = 0;
        while(count<n){
            if(refPtr==null){
                throw new IllegalArgumentException(n +" is greater than total number of nodes");
            }
            refPtr = refPtr.next;
            count++;
        }
        while (refPtr != null){
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }

    //Detecting Loop in SLL (Floyd's Cycle detection Algorithm)
    public boolean containsLoop(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while(fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(fastPtr == slowPtr){
                return true;
            }
        }
        return false;
    }

    // Here we need to create loop in SLL
    public void createLoopInLinkedList(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);

        head = first;      // Created loop in SLL
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;
    }

    // To find the Starting of the loop
    public ListNode startNodeInALoop(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while(fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(fastPtr==slowPtr){
                return getStartingNode(slowPtr);
            }
        }
        return null;
    }
    //For getting the starting point of loop
    public ListNode getStartingNode(ListNode slowPtr){
        ListNode temp = head;
        while(temp != slowPtr){
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        return temp;  // Starting point of the loop
    }

    // Here we are removing the loop from SLL
    public void removeLoop(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while(fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(fastPtr==slowPtr){
                removeLoops(slowPtr);
            }
        }
    }
    // this is subpart of removeLoop method
    public void removeLoops(ListNode slowPtr){
        ListNode temp = head;
        while(temp.next != slowPtr.next){
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        slowPtr.next = null;
    }


    public static void main(String[] args) {
        A_6_Linked_List_1_SinglyLinkedList sll = new A_6_Linked_List_1_SinglyLinkedList();  // Here we are creating object of class and initialise it

        /*
        // Here we are creating four Nodes
        sll.head = new ListNode(10);           // Here we are storing data in Singly Linked List
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        // Here we are connecting ListNodes together to form chain
        sll.head.next = second;  // 10 --> 1        // Here we are printing Singly Linked List Element by calling display() method

        second.next = third;     // 10 --> 1 --> 8
        third.next = fourth;    // 10 --> 1 --> 8 --> 11 --> null

        sll.display();
        */

        /*
        //Here we are printing length of SLL by calling length() method
        System.out.println("Length of SLL : " + sll.length());
        */

        /*
        // Here we insert node at the beginning of the Linked List
        sll.insertFirst(11);
        sll.insertFirst(8);
        sll.insertFirst(1);
        sll.display();
        */

        /*
        // Here we insert node at the End of the Linked List
        sll.insertLast(11);
        sll.insertLast(8);
        sll.insertLast(1);
        sll.display();
        */

        /*
        // Here we are inserting nodes at any given position
        sll.insert(1,3);  // 3 --> null
        sll.insert(2,5);  // 3 --> 5 --> null
        sll.insert(1,2);  // 2 --> 3 --> 5 --> null
        sll.insert(2,4); // 2--> 4--> 3 --> 5 --> null
        sll.insert(5,7); // 2--> 4--> 3 --> 5 --> 7-->null

        sll.display();
        */

        /*
        // Here we are deleting first node
        sll.insertLast(11);
        sll.insertLast(8);
        sll.insertLast(1);
        sll.display();

        System.out.println("The deleted node is : " + sll.deleteFirst().data);
        sll.display();
        */

        /*
        // Here we are deleting Last node
        sll.insertLast(11);
        sll.insertLast(8);
        sll.insertLast(1);
        sll.display();

        System.out.println("The deleted node is : " + sll.deleteLast().data);
        sll.display();
        */

        /*
        // Here we are deleting node at given position
        sll.insertLast(11);
        sll.insertLast(8);
        sll.insertLast(1);
        sll.display();

        sll.delete(2);
        sll.display();
        */

        /*
        // Here we are Removing Key from SLL
        sll.insertLast(11);
        sll.insertLast(8);
        sll.insertLast(1);
        sll.insertLast(2);
        sll.display();

        sll.deleteNode(1);
        sll.display();
        */

        /*
        // Here we are inserting node in Sorted SLL
        sll.insertLast(1);
        sll.insertLast(8);
        sll.insertLast(10);
        sll.insertLast(16);
        sll.display();

        sll.insertInSortedList(11);
        sll.display();
         */

        /*
        // Here we are removing duplicate node in Sorted SLL
        sll.insertLast(1);
        sll.insertLast(1);
        sll.insertLast(2);
        sll.insertLast(3);
        sll.insertLast(3);
        sll.display();

        sll.removeDuplicates();
        sll.display();
        */

        /*
        // Here we are searching whether key is present in SLL or not
        sll.insertLast(10);
        sll.insertLast(8);
        sll.insertLast(1);
        sll.insertLast(11);
        sll.display();

        if(sll.find(sll.head, 1)){
            System.out.println("Search Key found!!!");
        }
        else{
            System.out.println("Search Key not found!!!");
        }
        */

        /*
        // Here we are reversing SLL
        sll.insertLast(10);
        sll.insertLast(8);
        sll.insertLast(1);
        sll.insertLast(11);
        sll.display();

        ListNode reverseListHead = sll.reverse(sll.head);
        sll.printList(reverseListHead);
        */

        /*
        // Here we are finding the middle of SLL
        sll.insertLast(10);
        sll.insertLast(8);
        sll.insertLast(1);
        sll.insertLast(11);
        sll.display();
        System.out.println("Middle of SLL : " + sll.getMiddleNode().data);
        //Output :
        // 10 --> 8 --> 1 --> 11 --> null
        // Middle of SLL : 1
        */

        /*
        // Finding nth node from end SLL
        sll.insertLast(10);
        sll.insertLast(8);
        sll.insertLast(1);
        sll.insertLast(11);
        sll.insertLast(15);
        System.out.println("Nth node from end of SLL : " + sll.getNthNodeFromEnd(2).data);
        //Output : Nth node from end of SLL : 11
         */

        /*
        //Detecting Loop in SLL
        sll.createLoopInLinkedList();
        System.out.println("Is loop present : " + sll.containsLoop());
        //Output = Is loop present : true
        */

        /*
        // Getting the Starting point of the loop
        sll.createLoopInLinkedList();
        System.out.println("The start node of loop is : " + sll.startNodeInALoop().data);
        //Output :  The start node of loop is : 3
         */

        // Here removing loop from SLL
        sll.createLoopInLinkedList();
        sll.removeLoop();
        sll.display();
        //Output : 1 --> 2 --> 3 --> 4 --> 5 --> 6 --> null
    }
}
