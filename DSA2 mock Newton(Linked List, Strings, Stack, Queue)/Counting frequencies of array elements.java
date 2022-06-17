// "static void main" must be defined in a public class.
/*
Link : https://www.geeksforgeeks.org/counting-frequencies-of-array-elements/
Counting frequencies of array elements
Input :  arr[] = {10, 20, 20, 10, 10, 20, 5, 20}
Output : 10 3
         20 4
         5  1
Input : arr[] = {10, 20, 20}
Output : 10 1
         20 2 
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        countingFreq(arr);
    }
    
     //Most Optimal Solution : Time Complexity - O(N)  Space Complexity - O(1) 
    public static void countingFreq(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
             map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

----------
Output : 
20 -> 4
5 -> 1
10 -> 3
