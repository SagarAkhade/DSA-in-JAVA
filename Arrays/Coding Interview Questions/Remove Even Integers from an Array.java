package com.company;

// Q. Remove Even Integers from an Array | Coding Interview Question
public class A_3_Arrays_17_Remove_Even_Integers_From_Array {
    public static int[] removeEven(int[] arr){
        int oddCount = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 != 0){
                oddCount++;
            }
        }
        int[] result = new int[oddCount];
        int idx = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 != 0){
                result[idx] = arr[i];
                idx++;
            }
        }
        return result;
    }

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 7, 10, 6, 5};
        int[] result = removeEven(arr);
        printArray(result);
    }
}
-------------
Output -
3 7 5
