package com.myjoon.test.Leetcode.youngjoon;

public class StringToInteger_8 {
	public static void main(String[] args) {
		StringToInteger_8 test = new StringToInteger_8();
		
		System.out.println(test.myAtoi("-2-"));
	}
	
	public int myAtoi(String str) {
		StringBuilder sb = new StringBuilder();
		char charBuf;

		if (str == null) return 0;
		
		for (int i=0; i < str.length(); i++) {
			charBuf = str.charAt(i);
			if (charBuf == ' ' && sb.length() == 0) 
				continue;
			else if ((charBuf >= 48 && charBuf <= 57 )
					|| (sb.length() < 2 && (charBuf == 43 || charBuf == 45))) {
				sb.append(charBuf);
			}
			else {
				break;
			}
		}
		
		//System.out.println(sb.toString());
		try {
			return Integer.parseInt(sb.toString());
		} catch (NumberFormatException e) {
			if (sb.length() > 1){
                if (!(sb.toString().charAt(1) >= 48 && sb.toString().charAt(1) <= 57 ))
                	return 0;
                else if (sb.toString().charAt(0) == '-')
				    return -2147483648;
                else if (sb.toString().charAt(0) == '+' || (sb.toString().charAt(1) >= 48 && sb.toString().charAt(1) <= 57 ))
			        return 2147483647;
            } else {
                return 0;            
            }
		}
		return 0;
	}
}
