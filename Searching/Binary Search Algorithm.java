package com.company;

// Binary Search Algorithm
public class A_3_2_Binary_Search_2 {
    public static int binarySearch(int[] arr, int key){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){             // Time Complexity -> O(log N)
            int mid = (high + low)/2;   // Space Complexity -> O(1)
            if(arr[mid] == key){
                return mid;
            }
            if(key < arr[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 10, 20, 47, 59, 65, 75, 88, 99};
        int key = 65;
        System.out.println(binarySearch(arr, key));
    }
}
--------------
Output -
5
