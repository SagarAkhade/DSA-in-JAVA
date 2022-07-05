package com.company.A_7_Stack;
import java.util.Stack;

// Q. Next Greater Element | Coding Interview Question
public class A_7_Stack_3_Next_Greater_Element {
    public static void main(String[] args) {
        int[] arr = {4, 7, 3, 4, 8, 1};
        printArray(arr);
        int[] result = nextGreaterElement(arr);
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
-----------------------
Output - 
4 7 3 4 8 1 
7 8 4 8 -1 -1
