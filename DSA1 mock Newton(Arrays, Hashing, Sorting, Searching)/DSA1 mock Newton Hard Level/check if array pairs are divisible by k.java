// "static void main" must be defined in a public class.
/*
8. Given an array, check if array pairs are divisible by k
(for e.g arr = {10,23,90,40,60,77,21,79} and k = 10. Now the output would be true.
*/
public class Main {
    public static void main(String[] args) {
        int[] arr = {10,23,90, 40, 60,77,21,79};
        int k = 10;
        
        if(isDivisible(arr, k)){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
    }
    
    // Brute Force Approach - Time Complexity -> O(N)   Space Complexity -> O(1) 
    public static boolean isDivisible(int[] arr, int k){
        int sum = 0;
        for(int i=0; i<arr.length-1; i++){ 
            int j=i+1;
            sum = arr[i] + arr[j];
            if(sum%k == 0){
                return true;
            }
        }
        return false;  
    }
}
-------------
Output - 
true
