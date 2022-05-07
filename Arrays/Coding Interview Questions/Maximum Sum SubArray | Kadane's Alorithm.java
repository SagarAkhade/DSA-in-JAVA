package com.company;

public class A_3_Arrays_11_Kadenes_Algorithm_Maximum_Sum_SubArray {
    public static int maxSubArraySum(int[] arr){
        int maxSoFar = arr[0];
        int currentMax = arr[0];
        for(int i=1; i<arr.length; i++){
            currentMax = currentMax + arr[i];  // Q1 Element becomes part of current SubArray
            if(currentMax < arr[i]){
                currentMax = arr[i];    // Q2 Element decides to start its own subArray
            }
            if(maxSoFar < currentMax){
                maxSoFar = currentMax;
            }
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, -2, 6, -12, 7, -1, 6};
        System.out.println(maxSubArraySum(arr));
    }
}
-------
Output - 
12
