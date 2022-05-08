/*
- Problem Statement -
    [https://leetcode.com/problems/majority-element/](https://leetcode.com/problems/majority-element/)
    Given an array `nums` of size `n`, return *the majority element*.
    The majority element is the element that appears more than `⌊n / 2⌋` times. You may assume that the majority element always exists in the array.
    Example 1:
    Input: nums = [3,2,3]
    Output: 3
*/
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int number = 0;
        for(int i=0; i<nums.length; i++){
            if(count == 0){
                number = nums[i];
            }
            if(nums[i] == number){
                count++;
            }
            else{
                count--;
            }
        }
        return number;
    }
}
