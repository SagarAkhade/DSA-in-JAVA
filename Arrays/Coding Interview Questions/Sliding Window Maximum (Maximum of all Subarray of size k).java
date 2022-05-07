package com.company;

// Q. Sliding Window Maximum (Maximum of all Subarray of size k) | Coding Interview Question
public class A_3_Arrays_22_Sliding_Window_Maximum {
    public static void maxSlidingWindow(int[] arr, int k){
        int n = arr.length;    // Time Complexity -> O(N*k)
        int j, max;            // Space Complexity -> O(1)
        for(int i=0; i<=n-k; i++){
            max = arr[i];
            for(j=1; j<k; j++){
                if(arr[i+j]>max){
                    max = arr[i+j];
                }
            }
            System.out.print(max + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {44, 77, 33, 44, 88, 11};
        int k = 3;  //size of window
        maxSlidingWindow(arr, k);
    }
}
--------
Output -
77 77 88 88
