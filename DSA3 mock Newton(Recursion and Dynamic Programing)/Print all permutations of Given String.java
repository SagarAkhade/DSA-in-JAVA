// "static void main" must be defined in a public class.
/*
GFG :-
Link : https://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/
Q. Print all permutations of Given String
Input: ABC
Output: ABC ACB BAC BCA CBA CAB
*/

public class Main {
    public static void main(String[] args) {
        String str = "ABC";
        permuatations("", str);
    }
    
    public static void permuatations(String processed, String unProcessed) {
        if(unProcessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unProcessed.charAt(0);
        for(int i = 0; i <= processed.length(); i++) {
            String first = processed.substring(0, i);
            String second = processed.substring(i, processed.length());
            permuatations(first + ch + second, unProcessed.substring(1));
        }
    }
}
