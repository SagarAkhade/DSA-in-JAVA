package com.company;

// Q. Resize an Array :-
public class A_3_Arrays_5_Resize_An_Array {

    static int[] resize(int[] arr, int capacity){  // This Method is used for resizing an Array
        int[] temp = new int[capacity];
        for(int i=0; i<arr.length; i++){
            temp[i] = arr[i];
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 9, 10};
        System.out.println("The size of original Array: " + arr.length);
        int []brr = resize(arr, 10);
        System.out.println("The size of original Array after resize: " + brr.length);
    }
}
---------------
Output :-
The size of original Array: 5
The size of original Array after resize: 10
