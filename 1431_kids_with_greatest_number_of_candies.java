class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      List<Boolean> b=new ArrayList<>();
        int mx=candies[0];
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]>mx){mx=candies[i];}
        }
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies>=mx)
            {
                b.add(true);
            }
            else
            {
                b.add(false);
            }
        }
        return b;
    }
}
