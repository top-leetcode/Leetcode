package com.myjoon.test.Leetcode.youngjoon;

public class ShortestUnsortedContinuousSubarray_581 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int findUnsortedSubarray(int[] nums) {
     
    	int iMax = nums[0];
    	int iStartPos = 0;
    	for (int i=1; i < nums.length -1; i++) {
    		if (iMax > nums[i] && iStartPos == 0) {
    			iStartPos = i-1;
    		} else {
    			iMax = nums[i];
    		}
    	}
    	
    	return 0;
    }

}
