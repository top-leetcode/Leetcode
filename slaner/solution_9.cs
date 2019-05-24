/**
 *  9. Palindrome Number
 *  - https://leetcode.com/problems/palindrome-number/
 *
 *  HYEWON SLANER HWANG
 **/
 public class Solution {
    public bool IsPalindrome(int x) {
        // x가 음수거나, 나머지가 0이지만 x가 0이 아닐 경우
        // 회문 숫자가 아님
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int reversed = 0;
        while (x > reversed) {
            // 뒷자리를 하나씩 앞으로 땡겨온다.
            reversed = reversed * 10 + x % 10;

            // 10씩 나누면서 자릿수를 줄여간다.
            x /= 10;
        }

        // 짝수 자릿수일 경우 앞/뒤 비교
        // 홀수 자릿수일 경우 x와 10으로 나눈 reversed 비교 (중앙 값은 무시되기 때문)
        return x == reversed || x == reversed / 10;
    }
}