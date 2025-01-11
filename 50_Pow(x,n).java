class Solution {
    public double myPow(double x, int n) {
        if(n==0)
        {
            return 1;
        }
        long N=n;
        if(N<0)
        {
            x=1/x;
            N=-N;
        }
        double r=1.0;
        while(N>0)
        {
            if(N%2==1)
            {
                r=r*x;
            }
            x*=x;
            N=N/2;
        }
      return r;
    }
}
