package com.company.A_11_Dynamic_Programing;
// Q. find the nth term in Fibonacci series using DP
//Input: 6   Output: 8
//Fibonacci Series : 0 1 1 2 3 5 8 13 21 ....
public class A_01_Fibonacci_Number_Using_DP {
    public static int fibonacciNumber(int n) {
        int[] table = new int[n + 1];
        table[0] = 0;
        table[1] = 1;
        for(int i = 2; i <= n; i++) {
            table[i] = table[i - 1] + table[i - 2];
        }
        return table[n];
    }
    public static void main(String[] args) {
        System.out.println(fibonacciNumber(6));
        //Output: 8
    }
}
