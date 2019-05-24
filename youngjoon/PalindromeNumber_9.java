package com.myjoon.test.Leetcode.youngjoon;

public class PalindromeNumber_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeNumber_9 pn = new PalindromeNumber_9();
		
		System.out.println(pn.isPalindrome(121));
		System.out.println(pn.isPalindrome(12321));
		
	}

	public boolean isPalindrome(int x) {
        String strInt = String.valueOf(x);
        int iStrLength = strInt.length();
        char[] charReverse = new char[iStrLength];
        		
        for (int i=iStrLength -1; i >= 0 ; i--) {
        	charReverse[iStrLength -i -1] = strInt.charAt(i);
        }
        
		return (strInt.equals(new String(charReverse)));
    }
}
