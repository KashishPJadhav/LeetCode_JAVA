class Solution {
public:
    bool isPerfectSquare(int num) {
        if(num==0 || num==1)
        {
            return true;
        }
        long long l=1;long long h=num;
        while(l<=h)
        {
            long long m=l+(h-l)/2;
            long long s=m*m;
            if(s==num)
            {
                return true;
            }
            else if(s<num)
            {
                l=m+1;
            }
            else
            {
                h=m-1;
            }
        }
    return false;
    }
};
