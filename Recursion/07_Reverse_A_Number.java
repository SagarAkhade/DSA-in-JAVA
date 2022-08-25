package com.company.A_10_Recursion;
// Q. Reverse the Digits of a Number
// Input : 1342   Output : 2431

public class A_07_Reverse_A_Number {
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

    // Another way
    //Sometimes we might need some additional variables in the argument
    // in that case, make another function
    public static int reversDigitsOfNumber2(int n){
        int digits = (int)(Math.log10(n)) + 1;   // This will gives number of digits
        return helper(n, digits);
    }
    public static int helper(int n, int digits) {
        if(n%10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int)Math.pow(10, digits - 1) + helper(n/10, digits - 1);
    }

    public static void main(String[] args) {
        reversDigitsOfNumber1(1342);
        System.out.println(sum);   // Output : 2431
    }
}
