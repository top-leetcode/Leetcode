/**
 *  11. Container With Most Water
 *  - https://leetcode.com/problems/container-with-most-water/
 *
 *  HYEWON SLANER HWANG
 **/
public class Solution {
    public int MaxArea(int[] height) {
        // 앞, 뒤 두 개의 포인터 이용
        int f = 0, r = height.Length - 1;
        int maxarea = 0;

        // 두 포인터가 서로 다를 때만 반복
        while (f != r) {
            // 위치의 높이 최솟값 * rear - front
            int area = (r - f) * Math.Min(height[f], height[r]);
            if (area > maxarea) maxarea = area;

            // 높이가 낮은 쪽의 포인터를 이동시킨다.
            if (height[f] > height[r]) {
                r--;
            } else {
                f++;
            }
        };

        return maxarea;
    }
}