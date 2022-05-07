package com.company;

// Q. Rearrange Sorted Array in Max/Min form | Coding Interview Question
public class A_3_Arrays_21_Rearrange_Sorted_Array_In_MaxMin_Form {
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void arrangeMaxMin(int[] arr){
        int maxIdx = arr.length - 1;
        int minIdx = 0;
        int max = arr[maxIdx] + 1;
        for(int i=0; i<arr.length; i++){
            if(i%2 == 0){
                arr[i] = arr[i] + (arr[maxIdx] % max) * max;
                maxIdx--;
            }
            else{
                arr[i] = arr[i] + (arr[minIdx] % max) * max;
                minIdx++;
            }
        }
        for(int i=0; i< arr.length; i++){
            arr[i] = arr[i] / max;
        }
    }

    public static void main(String[] args) {
        int[] arr ={1, 2, 3, 4, 5, 6, 7};
        printArray(arr);
        System.out.println("After Rearrangement : ");
        arrangeMaxMin(arr);
        printArray(arr);
    }
}
--------------
Output -
1 2 3 4 5 6 7 
After Rearrangement : 
7 1 6 2 5 3 4
