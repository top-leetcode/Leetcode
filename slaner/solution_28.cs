/**
 *  28. Implement strStr()
 *  - https://leetcode.com/problems/implement-strstr/
 *
 *  HYEWON SLANER HWANG
 **/
public class Solution {
    public int StrStr(string haystack, string needle) {
        // needle이 빈 문자열이면 0을 반환한다.
        if (string.IsNullOrEmpty(needle)) return 0;

        int index = -1, needleLength = needle.Length - 1;
        for (int i = 0; i < haystack.Length; i++) {
            // i + needleLength 값이 haystack의 길이와 같거나 클 경우 종료한다.
            if (i + needleLength >= haystack.Length) break;

            // 첫 문자와 끝 문자가 같을 경우에만 수행한다.
            if (haystack[i] == needle[0] && haystack[i + needleLength] == needle[needleLength]) {
                bool match = true;
                for (int j = 1; j < needle.Length - 1; j++) {
                    if (haystack[i + j] != needle[j]) {
                        match = false;
                        break;
                    }
                }

                // 일치하면 i를 인덱스로 설정하고 반복을 종료한다.
                if (match) {
                    index = i;
                    break;
                }
            }
        }

        return index;
    }
}