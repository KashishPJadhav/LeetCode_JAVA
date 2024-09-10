class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        if(strs.empty())
        {
            return ""; //if string is empty.
        }
        sort(strs.begin(),strs.end()); //sorts the strings in lexographical order
        string f=strs.front(); //first string
        string l=strs.back(); //last string
        int minl=min(f.size(),l.size()) ;
        int i=0;
        while(i<minl && f[i]==l[i])
        {
            i++;
        }
        if(i==0)
        {
            return "";
        }
        return f.substr(0,i);
        
    }
};
