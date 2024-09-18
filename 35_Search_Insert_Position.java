class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            if(target==nums[i])
            {
                return i;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
        for(int j=i+1;j<nums.length;j++)
            {
                 if(target>nums[i] && target<nums[j])
            {
                return j;
            }
            }
        }
        if(target<nums[0])
        {
            return 0;
        }
        return nums.length;
    }

}
