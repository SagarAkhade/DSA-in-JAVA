package com.company.A_11_Dynamic_Programing;
// Q. find the nth term in Fibonacci series using DP
//Input: 6   Output: 8
//Fibonacci Series : 0 1 1 2 3 5 8 13 21 ....
public class A_01_Fibonacci_Number_Using_DP {
    //Bottom Down Approach of DP
    public static int fibonacciNumber(int n) {
        int[] table = new int[n + 1];
        table[0] = 0;
        table[1] = 1;
        for(int i = 2; i <= n; i++) {
            table[i] = table[i - 1] + table[i - 2];
        }
        return table[n];
    }
    //Top Down Approach of DP
    public static int fib(int[] memo, int n) {
        if(memo[n] == 0) {
            if(n < 2) {
                memo[n] = n;
            }
            else {
                int left = fib(memo, n - 1);
                int right = fib(memo, n - 2);
                memo[n] = left + right;
            }
        }
        return memo[n];
    }

    public static void main(String[] args) {
        //Bottom Down Approach of DP
        System.out.println(fibonacciNumber(6));
        //Output: 8

        //Top Down Approach of DP
        System.out.println(fib(new int[6 + 1], 6));
        //Output: 8
    }
}
