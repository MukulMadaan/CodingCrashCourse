class Solution {
public:
    string longestNiceSubstring(string s) {
        if(s.size()<2)return "";
        map<char,int> mp;
        for(auto it : s)mp[it]++;
        for(int i=0;i<s.size();i++){
            char ch = s[i];
            if(mp.count(toupper(s[i]))>0 && mp.count(tolower(s[i]))>0)continue;
            string s1 = longestNiceSubstring(s.substr(0,i));
            string s2 = longestNiceSubstring(s.substr(i+1));
            return s1.size()>=s2.size() ? s1 : s2;
        }
        return s;
    }
};
