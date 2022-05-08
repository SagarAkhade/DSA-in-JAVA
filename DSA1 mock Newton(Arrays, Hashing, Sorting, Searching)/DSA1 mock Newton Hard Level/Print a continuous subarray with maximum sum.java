// "static void main" must be defined in a public class.
/*
18. Print a continuous subarray with maximum sum.
Input: {-2, 1, -3, 4, -1, 2, 1, -5, 4}
Output: The contiguous subarray with the largest sum is {4, -1, 2, 1}
Input: arr = [-2, -3, 4, -1, -2, 1, 5, -3]
Output: [4, -1, -2, 1, 5]
Input: arr = [-2, -5, 6, -2, -3, 1, 5, -6] 
Output: [6, -2, -3, 1, 5] 
*/
public class Main {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        //System.out.println(maxSumSubarray(arr));
        maxSumSubarray(arr);
    }
    
    //Most Optimal Solution - Time Complexity -> O(n) Space Complexity -> O(1) 
    public static void maxSumSubarray(int[] arr){
        int currentSum = arr[0];
        int maxSum = arr[0];
        int start = 0;
        int end  = 0;
        for(int i=1; i<arr.length; i++){
            currentSum = currentSum + arr[i];
            if(currentSum < arr[i]){
                currentSum = arr[i];
                start = i;
            }
            if(maxSum<currentSum){
                maxSum = currentSum;
                end = i+1;
            }
        }
        //System.out.println(maxSum);
        for(int i=start; i<end; i++){
            System.out.print(arr[i]  + " ");
        }
    }
}
----------
Output - 
4 -1 2 1
