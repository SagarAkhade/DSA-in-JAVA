package com.company;
import java.util.*;

// Q. Two Sum problem | Coding Interview Question
// Given an Array and target element our task is to find the
// index of two element which add up to get target elememt
public class A_3_Arrays_8_Two_Sum_Problem {
    static int[] twoSum(int[] numbers, int target){  // This method to get index of array element whose sum is target
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<numbers.length; i++){
            if(!map.containsKey(target - numbers[i])){           //   Map - 2 0
                map.put(numbers[i], i);                          //        11 1
            }                                                    //         5 2
            else{                                                //        10 3
                result[1] = i;  // -> 4                                      
                result[0] = map.get(target - numbers[i]);        // 9 - 7 -> 2 -> 0
                return result;
            }
        }
        throw new IllegalArgumentException("Two numbers are not found");
    }

    public static void main(String[] args) {
        int[] numbers = {2, 11, 5, 10, 7, 8};
        int[] result = twoSum(numbers, 9);
        System.out.println("The two indices are : " + result[0] + " and " + result[1]);
    }
}
----------------------
Output :-
The two indices are : 0 and 4
