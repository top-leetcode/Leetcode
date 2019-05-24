/**
 *  12. Integer to Roman
 *  - https://leetcode.com/problems/integer-to-roman/
 *
 *  HYEWON SLANER HWANG
 **/
public class Solution {
    private string NumberToRoman(int number, char one, char five, char ten) {
        if (number <= 0) return string.Empty;
        if (1 <= number && number <= 3) return new string(one, number);
        if (number == 4) return $"{one}{five}";
        if (5 <= number && number <= 8) return five + new string(one, number - 5);
        return $"{one}{ten}";
    }
    public string IntToRoman(int num) {
        StringBuilder roman = new StringBuilder();
        byte[] values = new byte[4];

        values[0] = (byte) (num % 10);
        for (int i = 1; i < values.Length; i++) {
            num /= 10;
            values[i] = (byte) (num % 10);
        }

        roman.Append(NumberToRoman(values[3], 'M', ' ', ' '));
        roman.Append(NumberToRoman(values[2], 'C', 'D', 'M'));
        roman.Append(NumberToRoman(values[1], 'X', 'L', 'C'));
        roman.Append(NumberToRoman(values[0], 'I', 'V', 'X'));

        return roman.ToString();
    }
}