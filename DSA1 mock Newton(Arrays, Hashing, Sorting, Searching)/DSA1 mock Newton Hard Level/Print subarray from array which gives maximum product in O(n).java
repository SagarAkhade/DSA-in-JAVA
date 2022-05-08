// "static void main" must be defined in a public class.
/*
6. Print subarray from array which gives maximum product in O(n)
Input: arr[] = {6, -3, -10, 0, 2}
Output:   180  // The subarray is {6, -3, -10}
*/
public class Main {
    public static void main(String[] args) {
        int[] arr = {6, -3, -10, 0, 2};
        System.out.println(maxSubarrayProduct(arr));
    }
    
    // Brute Force Solution  Time Complexity -> O(N^2)  Space Complexity -> O(1) 
    public static int maxSubarrayProduct(int[] arr){
        int result = arr[0];
        for(int i=0; i<arr.length; i++){
            int multiply = arr[i];
            for(int j=i+1; j<arr.length; j++){
                result = Math.max(result, multiply);
                multiply = multiply * arr[j];
            }
            result = Math.max(result, multiply);
        }
        return result;
    }
}
---------------
Output - 
180
