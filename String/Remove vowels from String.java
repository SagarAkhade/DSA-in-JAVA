package com.company;
import java.util.*;

//Q. Remove vowels from String | Coding Interview Question
public class A_4_String_5_Remove_Vowels_From_String {
    public static void main(String[] args) {
        String str = "what is your name?";
        System.out.println(removeVowels(str));
    }

    //Optimal Solution Time Complexity -> O(N) Space Complexity -> O(N)
    public static String removeVowels(String str){
        Set<Character> vowels = Set.of('a','e','i','o','u');
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();

        for(char ch : charArray){
            if(!vowels.contains(ch)){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
-----------------
Output - 
wht s yr nm?
