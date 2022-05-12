// "static void main" must be defined in a public class.
// Queue is FIFO data Structure -> First In First Out
public class Main {
    public static void main(String[] args) {
        System.out.println("Queue Implementation of LinkedList!!!");
        Queue<Integer> q = new LinkedList<>();  //Syntax for Queue using LinkedList
        
        q.add(1);  //q.add(object) -> Method to add element in queue
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        // Display contents of the queue.
        System.out.println("Elements of queue " + q);
        
        // q.poll() -> Method to remove the head of Queue [q.remove() can also be used]
        System.out.println("removed element : " + q.poll()); 
  
        // Display contents of the queue after removing first element
        System.out.println(q);
  
        // q.peek() -> method to print the head of queue
        System.out.println("head of queue : " + q.peek());
        
        //q.isempty() -> Method to check queue is empty or not 
        System.out.println("Whether queue is empty or not : " + q.isEmpty());
        
        // q.size() -> method to print the size of queue
        System.out.println("Size of queue : " + q.size());
        
        // Iterating method for queue elements 
        Iterator iterator = q.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
--------------
Output - 
Queue Implementation of LinkedList!!!
Elements of queue [1, 2, 3, 4, 5]
removed element : 1
[2, 3, 4, 5]
head of queue : 2
Whether queue is empty or not : false
Size of queue : 4
2 3 4 5
