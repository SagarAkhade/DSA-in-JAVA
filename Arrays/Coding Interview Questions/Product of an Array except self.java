package com.company;

// Q. Product of an Array except self | Coding Interview Question
public class A_3_Arrays_19_Product_Of_Array_Except_Self {
    public static int[] findProduct(int[] arr){
        int temp = 1;
        int[] result = new int[arr.length];
        for(int i=0; i<arr.length; i++){   // for product of left elements
            result[i] = temp;             // Time Complexity -> O(N)
            temp = temp * arr[i];         // Space Complexity -> O(1)
        }
        temp = 1;
        for(int i=arr.length-1; i>=0; i--){  // for product of right elements
            result[i] = result[i] * temp;
            temp = temp * arr[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] result = findProduct(arr);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
----------------
Output - 
24 12 8 6
