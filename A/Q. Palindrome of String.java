// "static void main" must be defined in a public class.
// Q. Palindrome of String 

public class Main {
    public static void main(String[] args) {
        String str = "Saagar";
        System.out.println(isPalindrome(str));
    }
    
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while(start < end) {
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
