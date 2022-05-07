package com.company;

// Q. Finding minimum value from an Array :-
public class A_3_Arrays_3_Find_Minimum_in_Array {
    static int findMinimum(int[] arr){   // This Method for finding Minimum number in an Array
        if(arr == null || arr.length ==0){     // Here we are providing edge case
            throw new IllegalArgumentException("Invalid Array");
        }
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 15, 0, -2};
        System.out.print(findMinimum(arr));
    }
}
---------------
Output :-
1
