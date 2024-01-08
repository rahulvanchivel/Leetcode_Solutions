class Solution {
    public String interpret(String c) {
        StringBuilder s=new StringBuilder();
        for(int i=0;i<c.length();i++)
        {
            if(c.charAt(i)!='(' && c.charAt(i)!=')')
            {
                s.append(c.charAt(i));
            }
            else if(c.charAt(i)==')' && c.charAt(i-1)=='(')
            {
                s.append('o');
            }
        }
        return s.toString();
    }
}
