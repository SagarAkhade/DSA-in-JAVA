package com.company.A_7_Stack;
import java.util.Stack;

// Q. Valid Parentheses || Coding Interview question
public class A_7_Stack_4_Valid_Parentheses {
    public static void main(String[] args) {
        String str = "{()}";
        System.out.println(isValid(str));
    }

    // Optimal Solution Time Complexity -> O(N) Space Complexity -> O(N)
    public static boolean isValid(String str){
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for(char c : chars){
            if ((c=='(') || (c=='{') || (c=='[')) {
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    char top = stack.peek();
                    if((c==')' && top =='(') || (c=='}' && top =='{') || (c==']' && top =='[')){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
---------------
Output – 
true
