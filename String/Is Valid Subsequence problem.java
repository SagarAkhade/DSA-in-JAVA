package com.company;

// Q. Is Valid Subsequence problem | Coding Interview Question
public class A_4_String_3_Is_Valid_Subsequence {
    public static void main(String[] args) {
        String str = "abcde";
        String seq = "ace";
        if(isSubsequence(str, seq)){
            System.out.println(seq + " is a subsequence of " + str);
        }
        else{
            System.out.println(seq + " is not a subsequence of " + str);
        }
    }

    //Optimal Solution - Time Complexity -> O(N) Space Complexity -> O(1)
     public static boolean isSubsequence(String str, String seq){
         // Two pointer technique
        int i=0;    // traverse str
        int j=0;    // traverse seq
        while(i<str.length() && j<seq.length()){
            if(str.charAt(i) == seq.charAt(j)){   // str.charAt(i); method gives character at given index
                j++;
            }
            i++;
        }
        return j==seq.length();
    }
}
-----------------
Output - 
ace is a subsequence of abcde
