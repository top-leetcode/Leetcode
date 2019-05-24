package com.myjoon.test.Leetcode.youngjoon;

public class StringToInteger_8 {
	public static void main(String[] args) {
		StringToInteger_8 test = new StringToInteger_8();
		
		System.out.println(test.myAtoi("-123456789 ad"));
	}
	
	public int myAtoi(String str) {
		StringBuilder sb = new StringBuilder();
		char charBuf;
		boolean whiteSpace = true;
		for (int i=0; i < str.length(); i++) {
			charBuf = str.charAt(i);
			if (charBuf == ' ' && whiteSpace) 
				continue;
			else if ((charBuf >= 48 && charBuf <= 57 )
					|| charBuf == 77
					|| charBuf == 75) {
				sb.append(str.charAt(i));
				whiteSpace = false;
			}
			else {
				break;
			}
		}
		
		System.out.println(sb.toString());
		try {
			return Integer.parseInt(sb.toString());
		} catch (NumberFormatException e) {
			if (sb.toString().charAt(0) == '-')
				return -2147483648;
			else return 2147483647;
		}
		
	}
}
