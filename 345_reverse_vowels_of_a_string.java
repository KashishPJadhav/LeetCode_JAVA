class Solution {
    public String reverseVowels(String s) {
        StringBuffer sb=new StringBuffer(s);
           Stack<Character> v = new Stack<>();
          for(int i=0;i<s.length();i++)
          {
            if(s.charAt(i)=='a' || s.charAt(i)=='A'|| s.charAt(i)=='e' || s.charAt(i)=='E'||s.charAt(i)=='i' || s.charAt(i)=='I'||s.charAt(i)=='o' || s.charAt(i)=='O'||s.charAt(i)=='u' || s.charAt(i)=='U')
            {
                v.push(s.charAt(i));
            }
          }
          for(int i=0;i<s.length();i++)
          {
            if(s.charAt(i)=='a' || s.charAt(i)=='A'|| s.charAt(i)=='e' || s.charAt(i)=='E'||s.charAt(i)=='i' || s.charAt(i)=='I'||s.charAt(i)=='o' || s.charAt(i)=='O'||s.charAt(i)=='u' || s.charAt(i)=='U')
            {
                sb.setCharAt(i,v.pop());
            }
          }
        return sb.toString();
    }
}
