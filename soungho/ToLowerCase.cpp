class Solution {
public:
    string toLowerCase(string str) {
        
        for(int i = 0; i < str.length(); i++)
        {
            if(str.at(i) >= 65 and str.at(i) <= 90)
                str.at(i) += 32;
        }
        
        return str;
        
    }
};
