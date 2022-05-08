package com.company;

public class Sorting_4_QuickSort_1 {
    static int partition(int[] arr, int low, int high){ // Here we are getting index of pivot element
        int pivot = arr[high];
        int i = low;
        int j = low;
        while(i<=high){
            if(arr[i]<=pivot){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
        return j-1;
    }
    static void sort(int[] arr, int low, int high){  // This method is used for sorting elements on left & right of pivot element
        if(low<high){
            int p = partition(arr, low, high);
            sort(arr, low, p-1);
            sort(arr, p+1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{9, -3, 5, 2, 6, 8, -6, 1, 3};
        int high = arr.length-1;
        int low = 0;
        for(int i=0; i<arr.length; i++){  // Before Quick Sort
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sort(arr, low, high);
        for(int i=0; i<arr.length; i++){  // After Quick Sort
            System.out.print(arr[i] + " ");
        }
    }
}
================
Output :-
9 -3 5 2 6 8 -6 1 3 
-6 -3 1 2 3 5 6 8 9
