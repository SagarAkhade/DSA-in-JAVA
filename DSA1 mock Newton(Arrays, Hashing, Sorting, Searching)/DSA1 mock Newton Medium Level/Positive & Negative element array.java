// "static void main" must be defined in a public class.
/*
17. Given an unsorted array of both positive and negative integer. 
The task is to place all negative element at the end of array without changing 
the order of positive element and negative elements. 
Input = {1, -1, 3, 2, -7, -5, 11, 6}; 
Output = {1 3 2 11 6  -1 -7 -5};
*/
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};
        //sortPositiveNegative(arr);
        int[] result = sortPosNeg(arr);
        printArray(result);
    }
    
    // Brute Force Solution 
    public static int[] sortPosNeg(int[] arr){
        int[] result = new int[arr.length];  // Time Complexity -> O(N)
        int idx = 0;                         // Space Complexity -> O(N)
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                result[idx] = arr[i];
                idx++;
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]<0){
                result[idx] = arr[i];
                idx++;
            }
        }
        return result;
    }
    
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
--------------------
Output - 
1 3 2 11 6 -1 -7 -5
