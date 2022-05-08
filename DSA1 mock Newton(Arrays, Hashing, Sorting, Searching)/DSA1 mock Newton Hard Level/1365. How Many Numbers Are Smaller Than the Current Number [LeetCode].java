// link - https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
// "static void main" must be defined in a public class.
/*
11. Given the array nums, for each nums[i]. Find out how many numbers in the array are 
smaller than it. That is for each nums[i] you have to count the number of valid j’s 
such that j != i and nums[j] < nums[i]. Return the answer in an array. 
Input = {8, 1, 2, 2, 3}. Output = {4, 0, 1, 1, 3}.
*/
public class Main {
    public static void main(String[] args) {
        int[] arr = {8, 1, 2, 2, 3};
        int[] result = smallerNumbersThanCurrent(arr);
        printArray(result);
    }
    
    //Brute Force Solution  - Time Complexity -> O(N^2)  Space Complexity -> O(N)  
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        int idx = 0;
        for(int i=0; i<nums.length; i++){
            int count = 0;
            for(int j=0; j<nums.length; j++){
                if(i==j){
                    continue;
                }
                if(nums[j]<nums[i]){
                    count++;
                }
            }
            result[idx] = count;
            idx++;
        }
        return result;
    }
    
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }   
}
