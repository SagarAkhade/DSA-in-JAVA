package com.company;

public class A_3_Arrays_12_Find_Missing_Number_In_Array {
    public static int findMissingNumber(int[] arr){ // Algorithm to find missing number in array
        int n = arr.length + 1;
        int sum = n*(n+1)/2;
        for(int i=0; i<arr.length; i++){
            sum = sum - arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 8, 2, 4, 7};
        System.out.println(findMissingNumber(arr));
    }
}
---------------------
Output -
5
