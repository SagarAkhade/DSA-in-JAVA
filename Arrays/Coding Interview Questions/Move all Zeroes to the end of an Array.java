package com.company;

// Q. Move all Zeroes to the end of an Array :-
public class A_3_Arrays_4_Move_Zeroes_End_Of_Array {
    static void printArray(int[] arr){  // This Method is used for printing an Array Elements
        int n = arr.length;  // arr.length used to give size of an Array
        for(int i=0; i<n; i++){               // Time complexity O(n) and Space Complexity O(1)
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void moveZeroes(int[] arr, int n){  // This method will move Zeroes to End of an Array
        int j = 0;    // j will Focuses on zero elements
        for(int i=0; i<n; i++){     // i will Focuses on non-zero elements
            if(arr[i]!=0 && arr[j]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 4, 12};
        int n = arr.length;
        printArray(arr);
        moveZeroes(arr, n);
        printArray(arr);
    }
}
----------------
Output :-
0 1 0 4 12 
1 4 12 0 0
