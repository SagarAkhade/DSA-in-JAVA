// "static void main" must be defined in a public class.
/*
Check if a Given String is Palindrome
Input : ABCDCBA
Output : The given string is Palindrome
*/
public class Main {
    public static void main(String[] args) {
        String str = "ABCDCBA";
        
        if(isPalindrome(str)){
            System.out.println("The given string is Palindrome");
        }
        else{
            System.out.println("The given string is not Palindrome");
        }
    }
    
    //Optimal Solution : Time Complexity - O(N)  Space Complexity - O(1) 
    public static boolean isPalindrome(String str){
        int start = 0;
        int end = str.length()-1;
        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
----------
Output :
The given string is Palindrome
