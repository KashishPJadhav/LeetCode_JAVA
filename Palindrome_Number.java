class Solution {
    public boolean isPalindrome(int x) {
        if(x>0 || x==0)
        {
        int t=x;
        int r=0;
        while(x!=0)
        {
             r=(r*10)+(x%10);
             x=x/10;
        }
          if(t==r)
          {
            return true;
          }
          else
          {
            return false;
          }
        }
        else
        {
            return false;
        }

    }
}
