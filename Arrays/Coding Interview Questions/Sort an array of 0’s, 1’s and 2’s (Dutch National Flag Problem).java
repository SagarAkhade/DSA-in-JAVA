package com.company;

// Q. Sort an array of 0’s, 1’s and 2’s (Dutch National Flag Problem) | Coding Interview Question
public class A_3_Arrays_16_Sort_0s_1s_2s_Dutch_National_Flag_Problem {
    public static void threeNumberSort(int[] arr){
        int i = 0;
        int j = 0;
        int k = arr.length-1;
        while(i<=k){            // Time complexity -> O(N)
            if(arr[i] == 0){    // Space Complexity -> O(1)
                swap(arr, i, j);
                i++;
                j++;

            }
            else if(arr[i] == 1){
                i++;
            }
            else if(arr[i] == 2){
               swap(arr, i, k);
               k--;
            }
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 2, 0, 1, 2};
        threeNumberSort(arr);
        printArray(arr);
    }
}
----------------
Output - 
0 0 1 1 2 2 2
