class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target<=nums[0]) return 0;
        for(int i = 1; i< nums.length; i++){
            if(target == nums[i]) return i;
            if (target > nums[i -1] && target < nums[i]) return i;

            
        }
        return nums.length;
        
    }
}
