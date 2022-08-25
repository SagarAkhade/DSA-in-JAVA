package com.company.A_10_Recursion;
//Q. Remove the A's from the given string and print it
// Input : str = "baccad"   Output: "bccd"
public class A_14_Remove_As_From_String {
    //Time Complexity: O(n) & Space Complexity: O(n)
    public static String result = "";
    public static String removesAsFromString(String str, int index){
        if(index == str.length()){
            return result;
        }
        if(str.charAt(index) != 'a'){
            result = result + str.charAt(index);
        }
        return removesAsFromString(str, index + 1);
    }

    public static void main(String[] args) {
        String str = "baccad";
        System.out.println(removesAsFromString(str, 0));
        // Output: bccd
    }
}
