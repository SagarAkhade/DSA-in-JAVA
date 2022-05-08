package com.company;

public class Sorting_6_SelectionSort_1 {
    static void printArray(int[] arr){  // This method we use for printing an Array
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void selectionSort(int[] arr){ // This is Algorithm for Selection Sort
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int min = i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }


    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 9,10};
        printArray(arr);
        selectionSort(arr);
        printArray(arr);
    }
}
======================
Output :-
5 1 2 9 10 
1 2 5 9 10
