package com.company;

// Q. Find Second Maximum value in an Array | Coding Interview Question
public class A_3_Arrays_18_Second_Max_Element_In_Array {
    public static int findSecondMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){    // Time Complexity -> O(N)
            max = Math.max(max, arr[i]);    // Space Complexity -> O(1)
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]<max){
                secondMax = Math.max(secondMax, arr[i]);
            }
        }
        return secondMax;

    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 2, 34, 33, 1};
        System.out.println("The Second Max in an Array : " + findSecondMax(arr));
    }
}
-------------
output -
The Second Max in an Array : 33
