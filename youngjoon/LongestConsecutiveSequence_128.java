package com.myjoon.test.Leetcode.youngjoon;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence_128 {
	public static void main(String[] args) {
		int[] nums = {5,2,4,1,3};
		System.out.println(new LongestConsecutiveSequence_128().longestConsecutive(nums));
	}
	
	public int longestConsecutive(int[] nums) {
		
		Set<Integer> setNums = new HashSet<>();
        for(int num : nums) setNums.add(num);
		
		int iSeqCount = 0;
		int iMaxSeqCount = 0;
		
		for(int i=0; i < nums.length; i ++) {
			iSeqCount = 1;
			
			if (setNums.contains(nums[i] -1)) continue; 
			
			for (int j=nums[i]+1; setNums.contains(j) ;j++) {
					iSeqCount++;
			}

			iMaxSeqCount = Math.max(iSeqCount,  iMaxSeqCount);
			
		}
		
		return iMaxSeqCount;
    }
	


}
