package com.company.A_10_Recursion;
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

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> ans = subset(arr);
        System.out.println(ans);
        // Output : [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]
    }
}
