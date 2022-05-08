package com.company;

// Q. Search Insert Position in a Sorted Array | Coding Interview Question
public class A_3_Arrays_20_Search_Insert_Position_In_Sorted_Array {
    public static int searchInsert(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){        // Here we are using binary search Algorithm
            int mid = low + (high - low)/2;
            if(arr[mid] == target){     // Time Complexity -> O(log N)
                return mid;             // Space Complexity -> O(N)
            }
            if(target < arr[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7};  // Array is always sorted and distinct elements
        int target = 5;
        System.out.println(searchInsert(arr, target));
    }
}
-----------------
Output -
2
