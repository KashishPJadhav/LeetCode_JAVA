class Solution
{
public String mergeAlternately(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        StringBuffer s=new StringBuffer();
        int i=0,j=0;
        while(i<n||j<m) 
        {
              if(i<n)
              {
                s.append(word1.charAt(i));
                i++;
              }
              if(j<m)
              {
                s.append(word2.charAt(j));
                j++;
              }
        }
        while(i<n)
        {
            s.append(word1.charAt(i));
                i++;
        }
        while(j<m)
        {
            s.append(word2.charAt(j));
                j++;
        }
        return s.toString();
    }
    }
