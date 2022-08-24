package com.company.A_10_Recursion;
//Q. Search if target is present in Array or not using Recursive Binary Search
// Example : arr = {1, 2, 3, 4, 55, 66, 78};  target = 4;
// Output : 3
public class A_03_Binary_Search_Using_Recursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 55, 66, 78};
        int target = 4;
        System.out.println(binarySearch(arr, target, 0, arr.length - 1));
        // Output : 3
    }
    //Time Complexity: O(log n)   Space Complexity: O(n)
    public static int binarySearch(int[] arr, int target, int start, int end) {
        if(start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(arr[mid] == target){
            return mid;
        }
        if(target < arr[mid]) {
            return binarySearch(arr, target, start, mid - 1);
        }
        else{
            return binarySearch(arr, target, mid + 1, end);
        }
    }
}

