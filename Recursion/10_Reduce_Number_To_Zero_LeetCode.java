package com.company.A_10_Recursion;
/*
Given an integer num, return the number of steps to reduce it to zero.
In one step, if the current number is even, you have to divide it by 2,
otherwise, you have to subtract 1 from it.
Input: num = 14  Output: 6

Explanation:
Step 1) 14 is even; divide by 2 and obtain 7.
Step 2) 7 is odd; subtract 1 and obtain 6.
Step 3) 6 is even; divide by 2 and obtain 3.
Step 4) 3 is odd; subtract 1 and obtain 2.
Step 5) 2 is even; divide by 2 and obtain 1.
Step 6) 1 is odd; subtract 1 and obtain 0.

Link : https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
*/
public class A_10_Reduce_Number_To_Zero_LeetCode {
    //Time Complexity: O(n) & Space Complexity: O(n)
    public static int numberOfSteps(int num) {
        return helper(num, 0);
    }
    public static int helper(int num, int steps) {
        if(num == 0) {
            return steps;
        }
        if (num % 2 == 0){
            return helper(num/2, steps + 1);
        }
        return helper(num - 1, steps + 1);
    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));  // Output: 6
    }
}
