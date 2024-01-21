class Solution {
    public int lengthOfLongestSubstring(String s) {
        int st=0;
        int e=0;
        int max=Math.min(s.length(),1);
        Set<Character> seen=new HashSet<>();
        while(e<s.length())
        {
            char c=s.charAt(e);
            while(seen.contains(c))
            {
                seen.remove(s.charAt(st));
                st+=1;
            }
            seen.add(c);
             int si=e-st+1;
             max=Math.max(max,si);
             e+=1;
        }
        return max;
    }
}
