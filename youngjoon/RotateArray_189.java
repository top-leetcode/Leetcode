package com.myjoon.test.Leetcode.youngjoon;

public class RotateArray_189 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,2,3,4,5};
		new RotateArray_189().rotate(nums, 3);

		
        for (int i : nums) {
			System.out.println(i);
			
		}
}

	
    public void rotate(int[] nums, int k) {
        int[] nums_temp = new int[nums.length];
        
        int shiftCnt = k % nums.length;
                
        if (shiftCnt == 0) 
        	return;
        
        for (int i=0; i < nums.length; i++) {
        	nums_temp[(i+shiftCnt)%nums.length] = nums[i];
        }
        
        for (int i=0; i < nums.length; i++) {
        	nums[i] = nums_temp[i];
			
		}

    }
}
