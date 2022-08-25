package com.company.A_10_Recursion;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

//Q. Print all subset of an Array
//Input: arr = {1, 2, 3};
//Output : [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]
public class A_16_Print_All_Subset_Of_Array {
    //Time Complexity: O(n * 2^n) & Space Complexity: O(n * 2^n)
    // This is Iterative approach
    public static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outerList = new ArrayList<>();
        outerList.add(new ArrayList<>());
        for(int num : arr) {
            int n = outerList.size();
            for(int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outerList.get(i));
                internal.add(num);
                outerList.add(internal);
            }
        }
        return outerList;
    }

    // Here we have some duplicates in array
    public static List<List<Integer>> subsetDuplicates(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outerList = new ArrayList<>();
        outerList.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for(int i = 0; i < arr.length; i++) {
            start = 0;
            //if current and previous element is same, s = e + 1
            if(i > 0 && arr[i] == arr[i-1]) {
                start = end + 1;
            }
            end = outerList.size() - 1;
            int n = outerList.size();
            for(int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outerList.get(j));
                internal.add(arr[i]);
                outerList.add(internal);
            }
        }
        return outerList;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> ans = subset(arr);
        System.out.println(ans);
        // Output : [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]

        //Array with duplicates
        int[] arr1 = {1, 2, 2};
        List<List<Integer>> ans1 = subsetDuplicates(arr1);
        System.out.println(ans1);
        // Output : [[], [1], [2], [1, 2], [2, 2], [1, 2, 2]]
    }
}
