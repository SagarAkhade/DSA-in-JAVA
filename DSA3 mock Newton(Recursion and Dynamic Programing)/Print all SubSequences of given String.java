// "static void main" must be defined in a public class.
/*
// Q. Print all SubSequences of given String
// Input : str = "abc"
// Output: abc ab ac a bc b c -> Each on next line
*/
public class Main {
    public static void main(String[] args) {
        printSubsequences("", "abc");
    }
    public static void printSubsequences(String processed, String unProcessed) {
        if(unProcessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unProcessed.charAt(0);
        printSubsequences(processed, unProcessed.substring(1));
        printSubsequences(processed + ch, unProcessed.substring(1));
    }
}
