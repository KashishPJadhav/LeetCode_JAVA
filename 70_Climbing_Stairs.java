class Solution {
public:
    int climbStairs(int n) {
        if(n<=2)
        {
            return n;
        }
        int p1=2;
        int p2=1;
        int c=0;
        for(int i=3;i<=n;i++)
        {
            c=p1+p2;
            c=p2+p1;
            p2=p1;
            p1=c;

        }
        return c;
    }
};
