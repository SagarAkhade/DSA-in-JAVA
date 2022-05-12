package com.company.A_7_Stack;
import java.util.*;

// Q. Reverse String using Stack | Coding Interview Question
public class A_7_String_2_Reverse_String_using_Stack {
    public static void main(String[] args) {
        String str = "ABCD";
        System.out.println("Before reverse : " + str);
        System.out.println("After reverse : " + reverseString(str));
    }

    //Optimal Solution - Time Complexity -> O(N) Space Complexity -> O(N)
    public static String reverseString(String str){
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for(char c : chars){
            stack.push(c);  //push(data); method Put elements in Stack
        }
        for(int i=0; i<str.length(); i++){
            chars[i] = stack.pop();  //pop(); method removes the elements from Stack
        }
        return new String(chars);
    }
}
---------------
Output - 
Before reverse : ABCD
After reverse : DCBA
