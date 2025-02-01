class Solution {
    public int[] productExceptSelf(int[] nums) {
        int m=1;
        int b[]=nums;
        int a[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(!(i==j))
                {
                    m=m*nums[j];
                }
            } 
            a[i]=m; 
            m=1;  
        }
        return a;
    }
}
