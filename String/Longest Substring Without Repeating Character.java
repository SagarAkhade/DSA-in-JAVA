package com.company;
import java.util.*;

// Q. Longest Substring Without Repeating Characters | Coding Interview Question
public class A_4_String_6_Longest_SubString_Without_Repeating_Character {
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(str));
    }

    // Optimal Solution - Time Complexity -> O(N) Space Complexity -> O(1)
    public static int lengthOfLongestSubstring(String str){
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int start = 0;
        for(int end=0; end<str.length(); end++){
            char rightChar = str.charAt(end);
            if(map.containsKey(rightChar)){ // for increasing start value if we get repeating character
                start = Math.max(start, map.get(rightChar) + 1);
            }
            map.put(rightChar, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
}
---------------
Output - 
3
