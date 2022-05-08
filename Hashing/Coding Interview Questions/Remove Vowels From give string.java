package com.company;
import java.util.*;
import java.util.Set; // This package is required for Set method

// This program is for removing Vowels from input String
public class HashTable_2_PracticeQuestion_Remove_Vowel_From_String {
    public static String removeVowels(String str){ // We are creating a String method to remove Vowels from String
	    Set<Character> vowels = Set.of('a','e','i','o','u');  // Set.of method is used to create set of vowels
	    StringBuilder sb = new StringBuilder();  // StringBuilder method is used to give us back new updated String
	    // To iterate String Character by Character we use ' str.toCharArray(); ' method
	    char[] chars = str.toCharArray();  // str.toCharArray(); method converts String to Character array
	    for(Character ch : chars){    // This for loop is used to iterate characters one by one
	       if(!vowels.contains(ch)){   // vowels.contains(ch) method is used to check is value is present in set or not
	          sb.append(ch);    // sb.append(ch); is used to store values to new StringBuilder
	       }
	    }
	    return sb.toString();  // sb.toString(); method is used for converting everything into String
    }
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    System.out.println(removeVowels(str));
    }
}
==============================
Input :-
what is your name ?
Output :-
wht s yr nm ?
