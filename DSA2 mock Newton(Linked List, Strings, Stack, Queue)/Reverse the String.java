// "static void main" must be defined in a public class.
/*
Q. Reverse the String
Input : ABCD  Output : DCBA
*/ 
public class Main {
    public static void main(String[] args) {
        String str = "ABCD";
        reverseString(str);
    }
    
    //Optimal Solution : Time Complexity - O(N)  Space Complexity - O(1) 
    public static void reverseString(String str){
        for(int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
    }
}

-------
Output :
DCBA
