/**
 *  8. String to Integer (atoi)
 *  - https://leetcode.com/problems/string-to-integer-atoi/
 *
 *  HYEWON SLANER HWANG
 **/
public class Solution {
    public int MyAtoi(string s) {
        bool first = true;
        bool negative = false;
        bool leadingZero = true;

        Queue<byte> numbers = new Queue<byte>();
        for (int i = 0; i < s.Length; i++) {
            // 큐의 길이가 10을 넘어가면 종료한다.
            if (numbers.Count > 10) break;

            byte number = 0;
            // 첫 번째 문자는
            // 숫자 이외의 경우 음수 기호만 받을 수 있다.
            if (first) {
                // 첫 번째이면서 공백 문자일 경우 건너뛴다.
                if (char.IsWhiteSpace(s[i])) continue;

                // 음수 기호면 넘어가고
                // 숫자가 아니면 종료한다.
                if (s[i] == '-') negative = true;
                else if (s[i] == '+') negative = false;
                else if (!char.IsNumber(s[i])) break;
                else number = (byte) (s[i] - '0');

                first = false;
            }
            // 첫 번째 문자가 아니고
            else {
                // 숫자가 아니면 종료한다.
                if (!char.IsNumber(s[i])) break;
                number = (byte) (s[i] - '0');
            }

            if (number != 0) leadingZero = false;
            if (leadingZero) continue;

            // 숫자일 경우 큐에 추가한다.
            numbers.Enqueue((byte)(s[i] - '0'));
        }

        // 큐의 길이가 10을 넘어가는 경우 상황에 맞게 반환한다.
        if (numbers.Count > 10)
            return negative ? int.MinValue : int.MaxValue;

        long value = 0;
        while (numbers.Count > 0) {
            value = value * 10 + numbers.Dequeue();
        }

        if (negative) value = -value;
        if (value < int.MinValue) return int.MinValue;
        if (value > int.MaxValue) return int.MaxValue;
        return (int) value;
    }
}