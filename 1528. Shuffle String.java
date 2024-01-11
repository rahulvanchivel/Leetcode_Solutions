class Solution {
    public String restoreString(String s, int[] ind) {
        char[] c=new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            c[ind[i]]=s.charAt(i);
        }
        return new String(c);
    }
}
