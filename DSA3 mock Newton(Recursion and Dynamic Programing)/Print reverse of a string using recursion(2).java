// "static void main" must be defined in a public class.
/*
Link: https://www.geeksforgeeks.org/reverse-a-string-using-recursion/
Q. Print reverse of a string using recursion
Input : str = "Geeks for Geeks";
Output : skeeG rof skeeG
*/

public class Main {
    public static void main(String[] args) {
        String str = "Geeks for Geeks";
        System.out.println(str);
        
        reverseString(str, str.length() - 1);
        System.out.println(result);
    }
    public static String result = "";
    public static void reverseString(String str, int index){
        if(index == -1) {
            return;
        }
        result = result + str.charAt(index);
        reverseString(str, index - 1);
    }
}
