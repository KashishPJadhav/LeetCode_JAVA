class Solution {
    public String triangleType(int[] num) {
        if(num[0]== num[1] && num[1]==num[2])
        {
            return "equilateral";
        }
      else if(num[0]!= num[1] && num[1]!=num[2] && num[0]!=num[2])
        {
            if((num[0]+num[1])>num[2] && (num[0]+num[2])>num[1] && (num[1]+num[2])>num[0])
            {
                return "scalene";
            }
            else
            {
                return "none";
            }
        } 
        else if((num[0]== num[1]) && (num[0]+num[1])>num[2])
        {
            return "isosceles";
        }
        else if((num[0]== num[2]) && (num[0]+num[2])>num[1])
        {
            return "isosceles";
        }
        else if((num[1]== num[2]) && (num[2]+num[1])>num[0])
        {
            return "isosceles";
        }
        else
        {
            return "none";
        } 
        
    }
}
