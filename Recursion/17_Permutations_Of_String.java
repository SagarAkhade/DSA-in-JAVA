package com.company.A_10_Recursion;
import java.util.ArrayList;
// Q. Print all permutations of given string
// Input: "abc"  Output: bca bac cab acb abc -> Each on next Line
public class A_17_Permutations_Of_String {
    public static void permutations(String processed, String unProcessed) {
        if(unProcessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unProcessed.charAt(0);
        for(int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0, i);
            String second = processed.substring(i, processed.length());
            permutations(first + ch + second, unProcessed.substring(1));
        }
    }

    //Here we just return in ArrayList form
    public static ArrayList<String> permutationsList(String processed, String unProcessed) {
        if(unProcessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        char ch = unProcessed.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0, i);
            String second = processed.substring(i, processed.length());
            ans.addAll(permutationsList(first + ch + second, unProcessed.substring(1)));
        }
        return ans;
    }

    //To find number of permutations
    public static int permutationsCount(String processed, String unProcessed) {
        if(unProcessed.isEmpty()) {
            return 1;
        }
        int count = 0;
        char ch = unProcessed.charAt(0);
        for(int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0, i);
            String second = processed.substring(i, processed.length());
            count = count + permutationsCount(first + ch + second, unProcessed.substring(1));

        }
        return count;
    }
    public static void main(String[] args) {
        permutations("", "abc");
        //Output: bca bac cab acb abc -> Each on next Line

        //Getting permutation in ArrayList form
        ArrayList<String> ans = permutationsList("", "abc");
        System.out.println(ans);
        // Output : [cba, bca, bac, cab, acb, abc]

        //Getting permutation count
        System.out.println(permutationsCount("", "abc"));
        //Output : 6
    }
}
