class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int count = 1;
        int nextIn = 1;
        int curNum = nums[0];
        
        for(int i=1; i<nums.length; i++){
            if(curNum!=nums[i]){
                nums[nextIn] = nums[i];
                count++;
                nextIn++;
                curNum = nums[i];
            }
        }
        
        return count;
    }
}
