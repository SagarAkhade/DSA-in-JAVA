package com.company.A_10_Recursion;
// Q. Print numbers from n to 1 using Recursion
// Example: input n = 5
//Output: 5 4 3 2 1
public class A_04_Print_Numbers_From_N_to_1 {
    public static void main(String[] args) {
        printFromNtoOne(5);
        // Output : 5 4 3 2 1 -> Each on next Line
    }

    // Time Complexity : O(n) & Space Complexity : O(n)
    public static void printFromNtoOne(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printFromNtoOne(n - 1);
    }
}
