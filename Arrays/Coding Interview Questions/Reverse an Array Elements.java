package com.company;

// Q. Reverse an Array Elements :-
public class A_3_Arrays_5_Reverse_An_Array {
    static void printArray(int[] arr){  // This Method is used for printing an Array Elements
        int n = arr.length;  // arr.length used to give size of an Array
        for(int i=0; i<n; i++){               // Time complexity O(n) and Space Complexity O(1)
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void reverse(int[] numbers, int start, int end){  // This Method is used for reversing Array Elements
        while(start<end){                 // Time Complexity - O(log N)
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] =temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {2, 11, 5, 10, 7, 8};
        int start = 0;
        int end = numbers.length-1;
        printArray(numbers);
        reverse(numbers, start, end);
        printArray(numbers);
    }
}
---------------
Output :-
2 11 5 10 7 8 
8 7 10 5 11 2
