class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0)
        {
            return true;
        }
        for(int i=0;i<flowerbed.length;i++)
            {
               if(flowerbed[i]==0)
               {
                boolean le= (i==0)||(flowerbed[i-1]==0);
                boolean re=(i==flowerbed.length-1)||(flowerbed[i+1]==0);
                if(le && re)
                {
                    flowerbed[i]=1;
                    n--;
                if(n==0){return true;}
                i++;
                } 
               }
            }  
        return n==0;
    }
}
