class Solution {
    public String countAndSay(int n) {
        if(n==1)
        {return "1";}
        String cur="1";
        for(int i=2;i<=n;i++)
        {
            StringBuffer ns=new StringBuffer();
            int count=1;
            for(int j=1;j<cur.length();j++)
            {
                if(cur.charAt(j)==cur.charAt(j-1))
                {
                    count++;
                }
                else
                {
                    ns.append(count).append(cur.charAt(j-1));
                    count=1;
                }
               
            }
            ns.append(count).append(cur.charAt(cur.length()-1));
            cur=ns.toString();
        }
        return cur;
    }
}
