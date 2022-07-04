package com.company;
import java.util.HashMap;
import java.util.*;

// Q. First Non Repeating Character of String | Coding Interview Question
public class A_4_String_4_First_Non_Repeating_Character_In_String {
    public static void main(String[] args) {
        String str = "codeforcode";
        //String str = "aabb";
        System.out.println(firstNonRepeatingCharacter(str));
    }

    //Optimal Solution - Time Complexity -> O(N) Space Complexity -> O(N)
    public static int firstNonRepeatingCharacter(String str){
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        for(char ch : chars){ // putting characters in string with frequency
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(int i=0; i<chars.length; i++){  // Getting Index of first non-repeating character in String
            if(map.get(chars[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}
----------------
Output - 
4
