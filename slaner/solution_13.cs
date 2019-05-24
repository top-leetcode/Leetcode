/**
 *  13. Roman To Integer
 *  - https://leetcode.com/problems/roman-to-integer/
 *
 *  HYEWON SLANER HWANG
 **/
public class Solution {
    public int RomanToInt(string s) {
        int value = 0;
        for (int i = 0; i < s.Length; i++) {
            if (s[i] == 'M') value += 1000;
            else if (s[i] == 'D') value += 500;
            else if (s[i] == 'C') {
                if (i + 1 >= s.Length) {
                    value += 100;
                    break;
                }

                if (s[i + 1] == 'M') value += 900;
                else if (s[i + 1] == 'D') value += 400;
                else {
                    value += 100;
                    continue;
                }

                i++;
            }
            else if (s[i] == 'L') value += 50;
            else if (s[i] == 'X') {
                if (i + 1 >= s.Length) {
                    value += 10;
                    break;
                }

                if (s[i + 1] == 'C') value += 90;
                else if (s[i + 1] == 'L') value += 40;
                else {
                    value += 10;
                    continue;
                }

                i++;
            }
            else if (s[i] == 'V') value += 5;
            // I
            else {
                if (i + 1 >= s.Length) {
                    value += 1;
                    break;
                }

                if (s[i + 1] == 'X') value += 9;
                else if (s[i + 1] == 'V') value += 4;
                else {
                    value += 1;
                    continue;
                }

                i++;
            }
        }

        return value;
    }
}