// LeetCode - https://leetcode.com/problems/plus-one/
// "static void main" must be defined in a public class.
/*
13. Add 1 to number represented as an array
Input : [1, 2, 4]
Output : [1, 2, 5]
Input : [9, 9, 9]
Output : [1, 0, 0, 0]
*/
public class Main {
    public static void main(String[] args) {
        int[] arr = {9, 9, 9};
        int[] result = addOne(arr);
        printArray(result);
    }
    
    // Most optimal Solution - Time Complexity -> O(N)  Space Complexity -> O(N)
    public static int[] addOne(int[] arr){
        int i = arr.length - 1;
        
        while(i>=0){
            if(arr[i] != 9){
                arr[i] = arr[i] + 1;
                return arr;
            }
            arr[i] = 0;
            i--;
        }
        int[] result = new int[arr.length + 1];
        result[0] = 1;
        return result;
    }
    
    public static void printArray(int[] arr){
        for(int i=0 ; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
------------
Output -
1 0 0 0
