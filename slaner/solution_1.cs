/**
 *  1. Two Sum
 *  - https://leetcode.com/problems/two-sum/
 *
 *  HYEWON SLANER HWANG
 **/
public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        int[] solution = null;
        int i, j;
        for (i = 0; i < nums.Length - 1; i++) {
            for (j = 0; j < nums.Length; j++) {
                if (i == j) continue;
                if (nums[i] + nums[j] == target) {
                    solution = new int[] { i, j };
                    break;
                }
            }
            
            if (solution != null) break;
        }
        
        return solution;
    }
}