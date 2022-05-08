/*
- Problem Statement -
  link - https://leetcode.com/problems/heaters/
    Winter is coming! During the contest, your first job is to design a standard heater with a fixed warm radius to warm all the houses.
    Every house can be warmed, as long as the house is within the heater's warm radius range.
    Given the positions of `houses` and `heaters` on a horizontal line, return *the minimum radius standard of heaters so that those heaters could cover all houses.*
    **Notice** that all the `heaters` follow your radius standard, and the warm radius will the same.
    **Example 1:**
    Input: houses = [1,2,3], heaters = [2]
    Output: 1
    Explanation: The only heater was placed in the position 2, and if we use the radius 1 standard, then all the houses can be warmed.
*/
public class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        
        int i = 0, res = 0;
        for (int house : houses) {
            while (i < heaters.length - 1 && heaters[i] + heaters[i + 1] <= house * 2) {
                i++;
            }
            res = Math.max(res, Math.abs(heaters[i] - house));
        }
        return res;
    }
}
