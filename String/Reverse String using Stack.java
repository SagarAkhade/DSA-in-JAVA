package com.company;
import java.util.*;

// Q. Reverse String using Stack | Coding Interview Question 
public class A_4_String_2_Reverse_String_using_Stack {
    public static void main(String[] args) {
        String str = "ABCD";
        System.out.println("Before reverse : " + str);
        System.out.println("After reverse : " + reverseString(str));
    }

    public static String reverseString(String str){
        char[] chars = str.toCharArray();
        Stack<Character> stack = new Stack<>(); // Stack will store string -> LIFO
        for(char c : chars){
            stack.push(c);  // stack.push() method will add elements in stack
        }
        for(int i=0; i<str.length(); i++){
            chars[i] = stack.pop();  //stack.pop(); method will gives us elements back
        }
        return new String(chars);
    }
}
----------------------------
Output - 
Before reverse : ABCD
After reverse : DCBA
