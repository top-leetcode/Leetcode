/**
 *  14. Longest Common Prefix
 *  - https://leetcode.com/problems/longest-common-prefix/
 *
 *  HYEWON SLANER HWANG
 **/
public class Solution {
    public string LongestCommonPrefix(string[] strs) {
        if (strs.Length <= 0) return string.Empty;

        string stand = strs[0];
        int row = 0;

        while (stand.Length > row) {
            byte exit = 0;
            byte baseChar = (byte) stand[row];

            for (int i = 1; i < strs.Length; i++) {
                // row 보다 짧은 문자열일 경우 종료한다.
                if (strs[i].Length <= row) {
                    exit = 1;
                    break;
                }

                // 문자의 바이트 값을 가져오고
                // baseChar 값과 ch 값이 다르면 종료한다.
                byte ch = (byte) strs[i][row];
                if (baseChar != ch) {
                    exit = 1;
                    break;
                }
            }

            if (exit != 0) break;

            row++;
        }

        return stand.Substring(0, row);
    }
}