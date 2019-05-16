package com.myjoon.test.Leetcode.youngjoon;

public class ToLowerCase_709 {
	private final int  HIGH_CHAR_START = 65;
	private final int  HIGH_CHAR_END = 90;
	private final byte LOWER_VALUE = 32;

	static public void main(String[] args) {
		ToLowerCase_709 lc = new ToLowerCase_709();
		System.out.println(lc.toLowerCase("ABCD1234"));
	}
	
	public String toLowerCase(String str) {
		
		int length = str.length();
		byte[] byteData = str.getBytes();
		
		for (int i=0; i < length; i++) {
			if (isCapital(byteData[i]))
				byteData[i] = (byte) (byteData[i] | LOWER_VALUE);
		}

		return new String(byteData);
	}
	
	public boolean isCapital(byte data){
		if ((data >= HIGH_CHAR_START)
				&& (data < HIGH_CHAR_END)){
				return true;
		}
		return false;
	}
	

}
