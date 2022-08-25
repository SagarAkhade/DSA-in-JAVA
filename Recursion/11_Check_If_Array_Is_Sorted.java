package com.company.A_10_Recursion;
//Q. Check if given array is sorted or not
//Input: {1, 2, 3, 4, 4, 5}   Output: True
public class A_11_Check_If_Array_Is_Sorted {
    public static boolean isSorted(int[] arr, int index) {
        if(index == arr.length - 1){
            return true;
        }
        return (arr[index] <= arr[index + 1]) && isSorted(arr, index + 1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5};
        System.out.println(isSorted(arr, 0));
        //Output: true
    }
}
