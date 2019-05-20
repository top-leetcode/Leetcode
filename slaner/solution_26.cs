/**
 *  26. Remove Duplicates from Sorted Array
 *  - https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 *
 *  HYEWON SLANER HWANG
 **/
public class Solution {
    public int RemoveDuplicates(int[] nums) {
        // 배열의 길이가 0이라면 아무런 작업도 수행하지 않는다.
        if (nums.Length == 0) return 0;

        // 첫 번째 요소는 필수적으로 포함되므로 
        // 1부터 반복을 시작한다.
        int count = 1, current = nums[0];
        for (int i = 1; i < nums.Length; i++) {
            // 같은 숫자라면 건너뛴다.
            if (nums[i] == current) continue;

            // 현재 값을 갱신하고, 앞 위치로 이동시킨다.
            current = nums[count++] = nums[i];
        }
        
        return count;
    }
}