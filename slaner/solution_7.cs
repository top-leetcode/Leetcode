/**
 *  7. Reverse Integer
 *  - https://leetcode.com/problems/reverse-integer/
 *
 *  HYEWON SLANER HWANG
 **/
 public class Solution {
    public int Reverse(int x) {
        bool negative = false;
        if (x < 0) {
            negative = true;
            x = -x;
        }

        long reversed = 0;
        long remainderBase = 10;
        while (true) {
            int position = (int) (remainderBase / 10);
            if (x < position || x == 0) break;

            int one = (int) (x % remainderBase) / position;
            x -= (one * position);
            reversed = reversed * 10 + one;
            remainderBase *= 10;
        }

        if (negative) {
            if (-reversed < int.MinValue) return 0;
            return (int) -reversed;
        } else {
            if (reversed > int.MaxValue) return 0;
            return (int) reversed;
        }
    }
}