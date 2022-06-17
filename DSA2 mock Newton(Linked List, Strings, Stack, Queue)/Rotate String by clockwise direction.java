// "static void main" must be defined in a public class.
/*
Link : https://www.geeksforgeeks.org/left-rotation-right-rotation-string-2/
Q. Rotating a string by n places in the clockwise direction with O(1) space complexity.
Given a string of size n, write functions to perform the following operations on a string-
Left (Or anticlockwise) rotate the given string by d elements (where d <= n)
Right (Or clockwise) rotate the given string by d elements (where d <= n).
Input : s = "GeeksforGeeks" d = 2
Output :  Right Rotation : "ksGeeksforGee"
          Left Rotation  : "eksforGeeksGe" 
Input : s = "qwertyu"    d = 2
Output :  Right rotation : "yuqwert"
          Left rotation : "ertyuqw"
        
*/
public class Main {
    public static void main(String[] args) {
        String str = "GeeksforGeeks";
        int d=2;
        
        System.out.println("Initial String : " + str);
        System.out.println("Clockwise(Right) Rotation : " + rightRotation(str, d));
        System.out.println("Anti-Clockwise(Left) Rotation : " + leftRotation(str, d));
    }
    
    //Most Optimal Solutin : Time Complexity O(N) Space Complexity O(N)
    //Anti-clockwise rotation
    public static String leftRotation(String str, int d){
        String ans = str.substring(d) + str.substring(0, d);
        return ans;
    }
    //str.substring(d) -> method to get substrings of string
    //Clockwise rotation
    public static String rightRotation(String str, int d){
        return leftRotation(str , str.length()-d);
    }
}


----------
Output : 
Initial String : GeeksforGeeks
Clockwise(Right) Rotation : ksGeeksforGee
Anti-Clockwise(Left) Rotation : eksforGeeksGe
