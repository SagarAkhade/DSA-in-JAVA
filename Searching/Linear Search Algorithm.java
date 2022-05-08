package com.company;

// Linear Search Algorithm
public class A_3_1_Linear_Search_1 {
    public static int linearSearch(int[] arr, int n, int x){  // Linear Search Algorithm
        for(int i=0; i<n; i++){   // Time Complexity -> O(N)
            if(arr[i] == x){      // Space Complexity -> O(1)
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 9, 2, 10, 15, 20};
        int n = arr.length;
        int x = 10;
        System.out.println(linearSearch(arr, n, x));
    }
}
--------------
Output -
4
