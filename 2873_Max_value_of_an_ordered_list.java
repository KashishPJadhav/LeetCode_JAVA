class Solution {
    public long maximumTripletValue(int[] num) {
        int n=num.length;
        long max=0;
        long v;
        int i=0,j=0,k=0;
        for(i=0;i<n-2;i++)
        {
            for(j=i+1;j<n-1;j++)
            {
                for(k=j+1;k<n;k++)
                {
                    v=(num[i]-num[j])*(long)num[k];
                    max=Math.max(max,v);
                }
            }
        }
      return max;  
    }
}
