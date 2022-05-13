// "static void main" must be defined in a public class.
// Singly Linked List all Operations 
public class Main {
    private ListNode head; // Instance variable for storing link
    
    public static class ListNode{  //Creating static inner class for SinglyLinkedList 
        int data;
        ListNode next;
        
        public ListNode(int data){ // creating constructor 
            this.data = data;
            this.next = null;
        }
    }
    
    //Priting elements in SLL
    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
    //Printing length of SLL
    public int length(){
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
    
    //Inserting Element at first of SLL
    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }
    
    //Inserting Element at last of SLL
    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
        }
        ListNode current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }
    
    //Insert node at given posititon
    public void insert(int position, int value){
        ListNode node = new ListNode(value);
        if(head==null){
            node.next = head;
            head = node;
        }
        ListNode previous = head;
        int count = 1;
        while(count < position-1){
            previous = previous.next;
            count++;
        }
        ListNode current = previous.next;
        previous.next = node;
        node.next = current;
    }
    
    //Deleting first node of SLL
    public ListNode deleteFirst(){
        if(head == null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }
    
     //Deleting Last node of SLL
    public ListNode deleteLast(){
        if(head==null || head.next == null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while(current.next != null){
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }
    
    //Deleting node at given position
    public void delete(int position){
        if(position == 1){
            head = head.next;
        }
        else{
            ListNode previous = head;
            int count = 1;
            while(count<position-1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }            
    }
    
    //Deleting node at given key in SLL
    public void deleteNode(int key){
        ListNode current = head;
        ListNode temp = null;
        if(current != null && current.data == key){
            head = current.next;
            return;
        }
        while(current!=null && current.data != key){
            temp = current;
            current = current.next;
        }
        if(current == null){
            return;
        }
        temp.next = current.next;
    }
    
    //Insert node in Sorted SLL
    public ListNode insertInSortedList(int value){
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
    
    //Remove dublicates from SLL
    public void removeDuplicates(){
        if(head==null){
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
    
    //Check Whether key present in SLL or not
    public boolean find(ListNode head, int searchKey){
        if(head==null){
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
    
    //reverse SLL
    public ListNode reverse(ListNode head){
        if(head==null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
    //Printing elements in SLL
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
    
    //Detecting Loop in SLL
    public boolean containsLoop(){
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while(fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if(slowPtr == fastPtr){
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
        Main sll = new Main();  // creating object of class
        //Creating Singly Linked List 
        sll.head = new ListNode(1);
        sll.head.next = new ListNode(2);
        sll.head.next.next = new ListNode(3);
        sll.head.next.next.next = new ListNode(4);
        sll.head.next.next.next.next = new ListNode(5);
        
        sll.display();  //printing elements in SLL
        //Output :  1 --> 2 --> 3 --> 4 --> 5 --> null
        
        //Printing length of SLL
        System.out.println("Length of SLL : " + sll.length());  
        //Output :  Length of SLL : 5
        
        //Inserting Element at first of SLL
        sll.insertFirst(10);
        sll.display();
        //Output :  10 --> 1 --> 2 --> 3 --> 4 --> 5 --> null
        
        //Inserting Element at Last of SLL
        sll.insertLast(11);
        sll.display();
        //Output :  10 --> 1 --> 2 --> 3 --> 4 --> 5 --> 11 -->null
        
        //Inserting Element at given position
        sll.insert(4, 50);
        sll.display();
        //Output :  10 --> 1 --> 2 --> 50 --> 3 --> 4 --> 5 --> 11 -->null
        
        //Deleting first node of SLL
        System.out.println("First deleted node : " + sll.deleteFirst().data);
        //Output :  First deleted node : 10
        
        //Deleting Last node of SLL
        System.out.println("Last deleted node : " + sll.deleteLast().data);
        //Output :  First deleted node : 11
        
        //Deleting node at given position
        sll.delete(3);
        sll.display();
        //Output :  1 --> 2 --> 3 --> 4 --> 5 --> null
        
        //Deleting node at given key in SLL
        sll.deleteNode(3);
        sll.display();
        //Output :  1 --> 2 --> 4 --> 5 --> null
        
        //Insert node in Sorted SLL
        sll.insertInSortedList(3);
        sll.display();
        //Output :  1 --> 2 --> 3 --> 4 --> 5 --> null
        
        //Remove dublicates from SLL
        sll.insert(5, 4);  // added 4 for creating dublicate 
        sll.insert(6, 4);
        sll.display();
        //Output :  1 --> 2 --> 3 --> 4 --> 4 --> 4 --> 5 --> null
        sll.removeDuplicates();
        sll.display();
        //Output :  1 --> 2 --> 3 --> 4 --> 5 --> null
        
        //Check Whether key present in SLL or not
        System.out.println("Is key present : " + sll.find(sll.head, 5));
        //Output :  Is key present : true
        
        /*
        //Reversing the SLL
        ListNode reverseListHead = sll.reverse(sll.head);
        sll.printList(reverseListHead);
        //Output :  5 --> 4 --> 3 --> 2 --> 1 --> null
        */
        
        // Here we are finding the middle of SLL
        System.out.println("Middle node is : " + sll.getMiddleNode().data);
        //Output :  Middle node is : 3
        
        // Finding nth node from end SLL
        System.out.println("Nth node from end of SLL : " + sll.getNthNodeFromEnd(2).data);
        //Output :  Nth node from end of SLL : 4
        
        //Detecting Loop in SLL
        sll.createLoopInLinkedList();
        System.out.println("Is loop present : " + sll.containsLoop());
        //Output = Is loop present : true
        
        // Getting the Starting point of the loop
        sll.createLoopInLinkedList();
        System.out.println("The start node of loop is : " + sll.startNodeInALoop().data);
        //Output :  The start node of loop is : 3
        
        // Here removing loop from SLL
        sll.createLoopInLinkedList();
        sll.removeLoop();
        sll.display();
        //Output : 1 --> 2 --> 3 --> 4 --> 5 --> 6 --> null
    }
}
------------------
Output - 
1 --> 2 --> 3 --> 4 --> 5 --> null
Length of SLL : 5
10 --> 1 --> 2 --> 3 --> 4 --> 5 --> null
10 --> 1 --> 2 --> 3 --> 4 --> 5 --> 11 --> null
10 --> 1 --> 2 --> 50 --> 3 --> 4 --> 5 --> 11 --> null
First deleted node : 10
Last deleted node : 11
1 --> 2 --> 3 --> 4 --> 5 --> null
1 --> 2 --> 4 --> 5 --> null
1 --> 2 --> 3 --> 4 --> 5 --> null
1 --> 2 --> 3 --> 4 --> 4 --> 4 --> 5 --> null
1 --> 2 --> 3 --> 4 --> 5 --> null
Is key present : true
Middle node is : 3
Nth node from end of SLL : 4
Is loop present : true
The start node of loop is : 3
1 --> 2 --> 3 --> 4 --> 5 --> 6 --> null
