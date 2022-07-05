// "static void main" must be defined in a public class.
/*
Link : https://www.geeksforgeeks.org/next-greater-element/#:~:text=The%20Next%20greater%20Element%20for,next%20greater%20element%20as%20%2D1.
Q. Next Greater Element
Input : [4, 5, 2, 25]
Output : [5, 25, 25, -1]
Input : [13, 7, 6, 12]
Output : [-1, 12, 12, -1]
*/
public class Main {
    public static void main(String[] args) {
        int[] arr = {13, 7, 6, 12};
        printArray(arr);
        int[]result = nextGreater(arr);
        printArray(result);
    }
    
     //Optimal Solution - Time Complexity -> O(N) Space Complexity -> O(N)
    public static int[] nextGreaterElement(int[] arr){
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for(int i=arr.length-1; i>=0; i--){
            if(!stack.isEmpty()){      //stack.isEmpty() method is used to check whether stack is empty or not
                while (!stack.isEmpty() && stack.peek()<=arr[i]){  //stack.peek() method for pointing element at top
                    stack.pop();
                }
            }
            if(stack.isEmpty()){
                result[i] = -1;
            }else{
                result[i] = stack.peek(); //peek() method used for getting value at top of Stack
            }
            stack.push(arr[i]);  // push(object) method used to store element in Stack
        }
        return result;
    }
    
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

----------
Output : 
13 7 6 12 
-1 12 12 -1 
