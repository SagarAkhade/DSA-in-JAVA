package com.company.A_10_Recursion;
// Q. Write Code for nth term Fibonacci series
// Example : n = 6
//Output: 8
//Fibonacci series : 1 1 2 3 5 8 13 (sum of previous 2 terms)
public class A_02_Nth_TermOf_Fibonacci_Series {
    public static void main(String[] args) {
        System.out.println(fibonacci(4));
        // Output: 3
    }
    public static int fibonacci(int n){
        if(n < 2){  //base condition
            return n;
        }
        return  fibonacci(n-1) + fibonacci(n - 2);
    }
}
