package com.company.A_10_Recursion;
//Q. Print Factorial of given number using Recursion
// Input: 5   Output: 120

public class A_05_Factorial_Of_Number {
    public static void main(String[] args) {
        System.out.println(factorialOfNumber(5));
        // Output : 120
        System.out.println(sumOFNumbers(5));
        // Output : 15
    }
    //Time Complexity: O(n) & Space Complexity: O(n)
    public static int factorialOfNumber(int n) {
        if(n <= 1){
            return 1;
        }
        return (n * factorialOfNumber(n - 1));
    }

    public static int sumOFNumbers(int n){
        if(n<= 1){
            return 1;
        }
        return (n + sumOFNumbers(n - 1));
    }
}
