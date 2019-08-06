package com.myjoon.test.Leetcode.youngjoon;

public class ClimbingStairs_70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
    public int climbStairs(int n) {
        int[] result = new int[n+3];
    	result[0] = 0;
    	result[1] = 1;
    	result[2] = 2;
 
        for (int i=3; i <= n; i++) {
       		result[i] = result[i-1] + result[i-2];
        }
        
        return result[n];
        
    }
}
