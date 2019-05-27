package com.myjoon.test.Leetcode.youngjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum_18 {

	public static void main(String[] args) {
		int[] nums = {1,0,-1,0,-2, 2};
		
		FourSum_18 three = new FourSum_18();
		System.out.println(three.fourSum(nums, 0).toString());
	}

    public List<List<Integer>> fourSum(int[] nums, int target) {
    	List<List<Integer>> sumList = new ArrayList<List<Integer>>();
    	Arrays.parallelSort(nums);
    	
    	StringBuilder sb = new StringBuilder();
    	for (int i : nums)
    		sb.append(i + ", ");
    	System.out.println(sb);
    	
        for (int i=0; i < nums.length -3; i++) {
        	if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
	        	List<List<Integer>> tempList = threeSum(nums, i+1, nums[i], target - nums[i]);
	        	for (List list : tempList)
	        		sumList.add(list);
        	}
        }
    	return sumList;
    }

	public List<List<Integer>> threeSum(int[] nums, int start, int firstNum, int target) {
        List<List<Integer>> sumList = new ArrayList<List<Integer>>();
        
        int firstNumLimit = nums.length-2;
        int endLimit = nums.length-1;
        int iStartPos = 0;
        int iLastPos = 0;
        int targetSum = target;
        int tempSum = 0;
        
        for (int i=start; i < firstNumLimit ; i++) {
        	if (i == start || (i > start && nums[i] != nums[i-1])) 
        	{
        		iStartPos = i + 1;
        		iLastPos = endLimit;
        		
                while(iStartPos < iLastPos) {
                	tempSum = nums[i] + nums[iStartPos] + nums[iLastPos];
                	if (targetSum == tempSum) {
                		sumList.add(Arrays.asList(firstNum, nums[i], nums[iStartPos], nums[iLastPos]));
                		while (iStartPos < iLastPos && nums[iStartPos] == nums[++iStartPos]) {}
                		while (iStartPos < iLastPos && nums[iLastPos] == nums[--iLastPos]) {}
                		
                	} else if (tempSum < targetSum) {
                		iStartPos++;
                	} else {
                		iLastPos--;
                	}
                }
        	}
        }
        
	   	return sumList;
	}
}
