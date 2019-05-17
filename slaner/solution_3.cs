/**
 *  3. Longest Substring Without Repeating Characters
 *  - https://leetcode.com/problems/longest-substring-without-repeating-characters/
 *
 *  HYEWON SLANER HWANG
 **/
public class Solution {
    public int LengthOfLongestSubstring(string s) {
        int length = 0, currentLength = 0, startIndex = 0;

        Dictionary<byte, byte> checker = new Dictionary<byte, byte>();
        for (int i = 0; i < s.Length; i++) {
            byte value = (byte) s[i];

            if (checker.ContainsKey(value)) {
                if (currentLength > length)
                    length = currentLength;
                currentLength = 0;

                checker.Clear();
                i = startIndex;
                startIndex = i + 1;
                continue;
            }

            currentLength++;
            checker.Add(value, 0);
        }

        if (currentLength > length) length = currentLength;
        return length;
    }
}