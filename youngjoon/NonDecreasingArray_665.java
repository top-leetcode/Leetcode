package com.myjoon.test.Leetcode.youngjoon;

public class NonDecreasingArray_665 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,4,2,3}; //false
		int[] nums1 = {4,2,1}; // false
		int[] nums2 = {2,3,3,2,4}; //true
		int[] nums3 = {-1,4,2,3}; //true
		System.out.println(new NonDecreasingArray_665().checkPossibility(nums));
		System.out.println(new NonDecreasingArray_665().checkPossibility(nums1));
		System.out.println(new NonDecreasingArray_665().checkPossibility(nums2));
		System.out.println(new NonDecreasingArray_665().checkPossibility(nums3));
	}
	
	public boolean checkPossibility(int[] nums) {
		int iChgCount = 0;
		
		for (int i=0; i < nums.length-1; i++) {
			if (nums[i] <= nums[i+1]) 
				continue;
			
			else {
				iChgCount++;
				
				if (i > 0) { 
					if (iChgCount > 1) 
						return false;
				if (nums[i-1] <= nums[i+1])
					nums[i] = nums[i+1];
				else
					nums[i+1] = nums[i];
				}
			}
		}
		
		return true;
    }

}
