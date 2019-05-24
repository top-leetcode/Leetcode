/**
 *  15. 3Sum
 *  - https://leetcode.com/problems/3sum/
 *
 *  HYEWON SLANER HWANG
 **/
public class Solution {
    public IList<IList<int>> ThreeSum(int[] nums) {
        IList<IList<int>> result = new List<IList<int>>();

        // 배열의 요소를 정렬한 후 작업을 수행한다.
        Array.Sort(nums);

        for (int i = 0; i < nums.Length; i++) {
            // 동일한 수 건너뜀
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // f, r 포인터 두 개 사용
            int f = i + 1;
            int r = nums.Length - 1;

            while (f < r) {
                // 0일 경우 정답, 
                // 0보다 크면 뒤쪽을 땡겨오고
                // 0보다 작으면 앞쪽을 땡겨온다.
                int sum = nums[i] + nums[f] + nums[r];
                if (sum == 0) {
                    result.Add(new List<int> { nums[i], nums[f++], nums[r] });

                    // 동일한 수 건너뜀
                    while (f < r && nums[f] == nums[f - 1]) f++;
                } else if (sum > 0) {
                    r--;
                } else {
                    f++;
                }
            };
        }

        return result;
    }
}