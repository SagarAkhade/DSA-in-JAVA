package com.company;

// Q. Maximum Sum Subarray of size k | Coding Interview Question
public class A_3_Arrays_23_Maximum_Sum_SubArray_Size_K {
    public static int maxSubArraySum(int[] arr, int k){
        int maxSum = 0;         
        int windowSum = 0;
        int start = 0;
        for(int end=0; end<arr.length; end++){    // Time Complexity -> O(N)
            windowSum = windowSum + arr[end];    // Space Complexity -> O(1)
            if(end >= k-1){
                maxSum = Math.max(maxSum, windowSum);
                windowSum = windowSum - arr[start];
                start++;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 3, 5, 8, 1};
        int k = 3;
        System.out.println(maxSubArraySum(arr, k));
    }
}
------------------
Output -
16
