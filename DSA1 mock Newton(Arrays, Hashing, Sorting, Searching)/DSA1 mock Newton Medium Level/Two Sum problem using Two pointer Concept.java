package com.company;
import java.util.*;

// Q. Two sum problem using two pointer approach
public class A_3_Arrays_10_Two_Sum_Problem_Return_Values {
    static void printArray(int[] arr){  // This Method is used for printing an Array Elements
        int n = arr.length;  // arr.length used to give size of an Array
        for(int i=0; i<n; i++){               // Time complexity O(n) and Space Complexity O(1)
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] twoSum(int[] arr, int target){
        // Sorting and two pointer Approach
        Arrays.sort(arr);    // Arrays.sort(arr) is java method to directly sort an Array
        int  left = 0;
        int right = arr.length - 1;
        int[] result = new int[2];
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                result[0] = arr[left];
                result[1] = arr[right];
                return result;
            }
            else if(sum < target){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] arr = {11, 2, 0, 10, 7, 6};
        int target = 9;
        int[] result = twoSum(arr, target);
        printArray(result);
    }
}
-----------------------
Output :-
2 7 
