class Solution {
    public int[] productExceptSelf(int[] nums) {
        int a[]=new int[nums.length];
        int p=1;
        for(int i=0;i<nums.length;i++)
        {
            a[i]=p;
            p=p*nums[i];
        }
        int s=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            a[i]=a[i]*s;
            s=s*nums[i];
        }
        return a;
    }
}
