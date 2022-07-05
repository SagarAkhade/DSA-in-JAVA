// "static void main" must be defined in a public class.
// Stack is data structure used to store and remove data from it
// Stack is LIFO -> Last In First Out
public class Main {
    public static void main(String[] args) {
        System.out.println("Operations on Stacks!");
        Stack<Integer> stack = new Stack<>(); // Stack Declaration Symbol
        
        stack.push(10);  //stack.push(object) -> method used to add elements in stack
        stack.push(15);
        stack.push(20);
        System.out.println("Last enter Element : " + stack.peek()); // stack.peek(); method used to print element at top (i.e. last entered element in stack)
        System.out.println("Is stack empty : " + stack.isEmpty());  // stack.isEmpty(); method check whether stack is Empty or not 
        stack.pop(); //stack.pop() method is used for removing element from stack
        System.out.println("Last Enter Element : " + stack.peek());
    }
}
------------------------
Output - 
Operations on Stacks!
Last enter Element : 20
Is stack empty : false
Last Enter Element : 15
