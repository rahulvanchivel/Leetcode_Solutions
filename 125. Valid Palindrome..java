class Solution {
    public boolean isPalindrome(String s) {
        String str=s.replaceAll("[^a-zA-Z0-9]","");
        str=str.toLowerCase();
        StringBuilder strb=new StringBuilder(str);
        strb.reverse();
        String str1=strb.toString();
        if(str.equals(str1))
        {
            return true;
        }
        return false;
    }
}
