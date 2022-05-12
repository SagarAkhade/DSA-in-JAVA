package com.company;

// Q. Check given String is Palindrome or not | Coding Interview Question
public class A_4_String_1_Check_Palindrome_String {
    public static void main(String[] args) {
        String str = "madam";
        if (isPalindrome(str)) {
            System.out.println("String is Palindrome!");
        } else {
            System.out.println("String is not Palindrome!");
        }
    }
    public static boolean isPalindrome(String str){
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;
        while(start < end){
            if(charArray[start] != charArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
------------
Output - 
String is Palindrome!
