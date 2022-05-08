package com.company;

// This program is for Merge Sort Algorithm
public class Sorting_5_MergeSort_1 {
    static void printArray(int[] arr){  // This method we use for printing an Array
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void mergeSort(int[] arr, int[] temp, int low, int high){ // This is Algorithm for Merge Sort
        if(low<high){ // This is base case
            int mid = low + (high-low)/2;   // We are dividing array in two parts
            mergeSort(arr, temp, low, mid);
            mergeSort(arr, temp, mid+1, high);
            merge(arr, temp, low, mid, high);
        }
    }

    static void merge(int[] arr, int[] temp, int low, int mid, int high){ // This is Merging an Array
        for(int i=low; i<=high; i++){
            temp[i]=arr[i];
        }
        int i=low;      // traverse left sorted subarray
        int j=mid+1;    // traverse right sorted subarray
        int k=low;      // will merge both arrays into original array
        while(i<=mid && j<=high){
            if(temp[i]<=temp[j]){
                arr[k]=temp[i];
                i++;
            }
            else{
                arr[k]=temp[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            arr[k]=temp[i];
            i++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] {9, 5, 2, 4, 3, -1};
        int[] temp = new int[arr.length];
        int low = 0;
        int high = arr.length - 1;
        printArray(arr);
        mergeSort(arr, temp, low, high);
        printArray(arr);

    }
}
=================
Output :-
9 5 2 4 3 -1 
-1 2 3 4 5 9
