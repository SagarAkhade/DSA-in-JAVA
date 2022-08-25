package com.company.A_10_Recursion;
//Q. Find sum of digits of number
// Input: 1342    Output: 10 -> (1 + 3 + 4 + 2 = 10)
public class A_06_Sum_Of_Digits_Of_Number {
    public static void main(String[] args) {
        System.out.println(digitSum(1342));        // Output: 10
        System.out.println(digitProduct(1342));    // Output: 24
    }
    //Time Complexity: O(n) & Space Complexity: O(n)
    public static int digitSum(int n){
        if(n == 0) {
            return 0;
        }
        return (n % 10) + digitSum(n / 10);
    }

    //Extra: Product of all digits
    public static int digitProduct(int n){
        if(n % 10 == n) {
            return n;
        }
        return (n % 10) * digitProduct(n / 10);
    }
}
