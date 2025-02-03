class Solution {
    public boolean increasingTriplet(int[] nums) {
        boolean b[]=new boolean[nums.length];
        if(nums.length<3){return false;}
        
        int m=Integer.MAX_VALUE;
        int s=Integer.MAX_VALUE;
        for(int n:nums)
        {
            if(n<=m)
            {m=n;}
            else if(n<=s)
            {s=n;}
            else
            {return true;}
        }
        return false;
    }
}
