package com.company.A_10_Recursion;

import java.util.ArrayList;

// Q. Print all SubSequences of given String
// Input : str = "abc"
// Output: abc ab ac a bc b c -> Each on next line
public class A_15_Print_SubSequences_Of_String {
    public static void printSubSequence(String processed, String unProcessed) {
        if(unProcessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unProcessed.charAt(0);
        printSubSequence(processed, unProcessed.substring(1));
        printSubSequence(processed + ch, unProcessed.substring(1));
    }

    // Returning in subsequence in form of List
    public static ArrayList<String> printSubSequence1(String processed, String unProcessed) {
        if(unProcessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        char ch = unProcessed.charAt(0);
        ArrayList<String> left = printSubSequence1(processed + ch, unProcessed.substring(1));
        ArrayList<String> right = printSubSequence1(processed, unProcessed.substring(1));
        left.addAll(right);
        return left;
    }
    public static void main(String[] args) {
        printSubSequence("", "abc");
        // Output: abc ab ac a bc b c -> Each on next line

        System.out.println(printSubSequence1("", "abc"));
        // Output : [abc, ab, ac, a, bc, b, c, ]
    }
}
