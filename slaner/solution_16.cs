/**
 *  16. 3Sum Closest
 *  - https://leetcode.com/problems/3sum-closest/
 *
 *  HYEWON SLANER HWANG
 **/
public class Solution {
    public int ThreeSumClosest(int[] nums, int target) {
        // 3Sum과 동일하게 정렬
        Array.Sort(nums);

        int closestSum = 0;
        int closest = int.MaxValue;
        for (int i = 0; i < nums.Length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int f = i + 1;
            int r = nums.Length - 1;
            while (f < r) {
                // 합을 구하고 대상 값과의 거리를 구함
                int sum = nums[i] + nums[f] + nums[r];
                int distance = Math.Abs(target - sum);

                // 동일하면 바로 반환하고
                // 크면 뒤쪽의 값을 땡겨오고
                // 작으면 앞쪽의 값을 땡겨온다.
                if (sum == target) return target;
                else if (sum > target) r--;
                else if (sum < target) f++;

                // 지금까지 찾은 값 중에 가장 근접한 경우
                // 값을 변경한다.
                if (distance < closest) {
                    closestSum = sum;
                    closest = distance;
                }
            }
        }

        // 그나마 근접한 값 반환
        return closestSum;
    }
}