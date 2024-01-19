class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=s.length();
        int m=t.length();
        char s1[]=s.toCharArray();
        char s2[]=t.toCharArray();
        int i=0;
        int j=0;
        while(i<n && j<m)
        {
            if(s1[i]==s2[j])
            {
                i++;
                j++;
            }
            else
            {
                j++;
            }
        }
        if(i==n)
        {
            return true;
        }
        return false;
    }
}
