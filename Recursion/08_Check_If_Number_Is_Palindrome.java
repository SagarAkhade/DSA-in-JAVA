package com.company.A_10_Recursion;
// Q. Check if Given number is palindrome or Not
// Input: 1221  Output: true

public class A_08_Check_If_Number_Is_Palindrome {
    public static int sum = 0;
    //Time Complexity: O(n) & Space Complexity: O(n)
    public static void reversDigitsOfNumber1(int n) {
        if(n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reversDigitsOfNumber1(n / 10);
    }
    public static boolean palindromeNumber(int n) {
        return (n == sum);
    }
    public static void main(String[] args) {
        reversDigitsOfNumber1(1221);
        System.out.println(palindromeNumber(1221));  // Output : true
    }
}
