package com.company.A_10_Recursion;
// Q. Binary Search in rotated Sorted array
//Input: arr = {5, 6, 7, 8, 9, 1, 2, 3}   target = 8
//Output: 3
public class A_13_Binary_Search_In_Rotated_Sorted_Array {
    //Time Complexity: O(n) & Space Complexity: O(n)
    static int searchInRotatedSortedArray(int[] arr, int target, int start, int end) {
        if(start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(arr[mid] == target) {
            return mid;
        }
        if(arr[start] <= arr[mid]){
            if(target >= arr[start] && target <= arr[mid]){
                return searchInRotatedSortedArray(arr, target, start, mid -1);
            }
            else{
                return searchInRotatedSortedArray(arr, target, mid + 1, end);
            }
        }
        return searchInRotatedSortedArray(arr, target, mid + 1, end);
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(searchInRotatedSortedArray(arr, 8, 0, arr.length - 1));
        //Output : 3
    }
}
