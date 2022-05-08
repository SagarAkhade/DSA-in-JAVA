package com.company;
import java.util.*;  

// This is program for longest SubString without repeating Characters
public class HashTable_4_PracticeQuestion_Longest_Substring_Without_Repeating_Character_Google {
    public static void main(String[] args) {
        System.out.println("To find length of longest subString without 
							repeating Characters!!! str =\"abcabcbb\" ");
        Scanner sc = new Scanner(System.in);
        String str = "abcabcbb";
        System.out.println(longSubString(str));
    }
    public static int longSubString(String s){
        Map<Character, Integer> map = new HashMap<>(); 
        int maxLength = 0;
        int start = 0;
        for(int end=0; end<s.length(); end++){ 
            char rightChar = s.charAt(end);   
            if(map.containsKey(rightChar)){   
                start = Math.max(start, map.get(rightChar)+1);
            }
            map.put(rightChar, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
}
======================
Output :-
To find length of longest subString without repeating Characters!!! str ="abcabcbb" 
3
