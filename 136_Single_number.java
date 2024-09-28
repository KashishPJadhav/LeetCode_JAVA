class Solution {
    public int singleNumber(int[] nums) {
        int r=0;
        for(int i:nums)
        {
            r=r^i;
        }
        return r;
        
    }
}
