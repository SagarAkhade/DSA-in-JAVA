package com.company.A_10_Recursion;
import java.util.ArrayList;
// Q. Linear search using recursion
//Input: arr={3, 2, 1, 18, 9}  target = 18
//Output : true

public class A_12_Linear_Search_Using_Recursion {
    public static boolean linearSearch(int[] arr, int target, int index) {
        if(index == arr.length){
            return false;
        }
        if(arr[index] == target){
            return true;
        }
        else{
            return linearSearch(arr, target, index + 1);
        }
    }

    //Some Extra: find all index if present
    public static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
            return  findAllIndex(arr, target, index + 1, list);
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 1, 18, 9};
        int target = 18;
        System.out.println(linearSearch(arr, target, 0));
        //Output: true
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(findAllIndex(arr, 1, 0, list));
        //Output : [2, 3]
    }
}
