package com.company;
// Q. Squares of Sorted Array | Coding Interview Question
public class A_3_Arrays_13_Square_Of_Sorted_Array {
    public static int[] sortedSquares(int[] arr){
        // Two pointer technique
        int n = arr.length;
        int i=0;
        int j=n-1;
        int[] result = new int[n];
        for(int k=n-1; k>=0; k--){
            if(Math.abs(arr[i]) > Math.abs(arr[j])){
                result[k] = arr[i]*arr[i];
                i++;
            }
            else{
                result[k] = arr[j]*arr[j];
                j--;
            }
        }
        return result;
    }
    public static void printArray(int[] arr){ // This method for printing Array elements
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};
        int[] result = sortedSquares(arr);
        printArray(result);
    }
}
--------------
Output -
0 1 9 16 100
