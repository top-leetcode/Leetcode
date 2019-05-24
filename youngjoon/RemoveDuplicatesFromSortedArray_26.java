package com.myjoon.test.Leetcode.youngjoon;

public class RemoveDuplicatesFromSortedArray_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicatesFromSortedArray_26 r26 = new RemoveDuplicatesFromSortedArray_26();

		int[] nums = {0,1,2,3,3,3,5,6};
		int iRet = r26.removeDuplicates(nums);
		System.out.println(iRet);
		
		for (int i=0; i < iRet; i++) {
			System.out.println(nums[i]);
		}
	}
	
    public int removeDuplicates(int[] nums) {
    	if (nums == null || nums.length < 1)
    		return 0;
    	
    	int compareNum = nums[0];
    	int iCount = 1;
    	int iInputPos = 0;
    	boolean bSameFlag = false;
    	
    	for (int i=1; i < nums.length; i++) {
    		if (compareNum != nums[i])
    		{
    			if (bSameFlag) {
    				nums[iCount] = nums[i];
    			}
    			
    			iCount++;
	    		compareNum = nums[i];
    		}else {
    			bSameFlag = true;
    		}
    	}
    
    	return iCount;
    }

}
