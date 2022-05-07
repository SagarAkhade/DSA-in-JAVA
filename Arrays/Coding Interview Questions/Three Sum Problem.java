package com.company;
import java.util.*;

// Q. Three Sum Problem | Coding Interview Question
// Here we use three pointer approach
public class A_3_Arrays_15_Three_Sum_Problem {
    public static void threeSum(int[] arr, int target){
        Arrays.sort(arr);
        for(int i=0; i<arr.length-2; i++){     // Time Complexity O(N^2)
            int j=i+1;
            int k=arr.length-1;
            while(j<k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum == target){
                    System.out.print(arr[i] + ", " + arr[j] + ", " + arr[k]);
                    System.out.println();
                    j++;
                    k--;
                }
                else if(sum<target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 7, 1, 8, 9, 0};
        int target = 6;
        threeSum(arr, target);
    }
}
----------------
Output - 
0, 2, 4
1, 2, 3
