package com.company.A_10_Recursion;
// Q. Count number of Zeros in a number
//Input: 302100    Output: 3

public class A_09_Count_Zeros_In_Number {
    //Time Complexity: O(n) & Space Complexity: O(n)
    public static int countZeros(int n) {
        return helper(n, 0);
    }
    public static int helper(int n, int count) {
        if(n == 0) {
            return count;
        }
        int rem = n % 10;
        if(rem == 0){
            return helper(n / 10, count + 1);
        }
        return helper(n / 10, count);
    }
    public static void main(String[] args) {
        System.out.println(countZeros(302100));  // Output: 3
    }
}
