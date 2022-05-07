package com.company;

// Q. Check whether a String is Palindrome or Not | Coding Interview Question
// Palindrome is word which is same from start and back
// Ex. "madam"
public class A_3_Arrays_7_Check_Palindrome_String {
    static boolean isPalindrome(String word){  // This Method for checking Palindrome
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = word.length() - 1;

        while(start<end){      // Here we are comparing the string elements
            if(charArray[start] != charArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String word = "madam";
        if(isPalindrome(word)){
            System.out.println("The String is Palindrome!!!");
        }
        else{
            System.out.println("The String is not Palindrome!!!");
        }
    }
}
---------------
Output :-
The String is Palindrome!!!
