package com.company.A_10_Recursion;
//Write a function that takes in number and print it
//print first 5 numbers : 1 2 3 4 5
public class A_01_Numbers_Example {
    public static void main(String[] args) {
        print(1);
        // Output : 1 2 3 4 5 -> Each on next Line
    }
    public static void print(int n){
        if(n==5) {    //base condition for recursion
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1);  //Recursive call
    }
}
