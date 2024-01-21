class Solution {
    public int myAtoi(String s) {
        if (s.isEmpty())
            return 0;
        long si=1,res=0;
        int i=0;
        while (i<s.length()&&s.charAt(i)==' ') 
        {
            i++;
        }
        if(i<s.length()&&(s.charAt(i)=='-' || s.charAt(i)=='+')) 
        {
            si=(s.charAt(i++)=='-') ? -1 : 1;
        }
        while(i<s.length()&&Character.isDigit(s.charAt(i))) 
        {
            int digit=s.charAt(i++) - '0';
            if(res>(Integer.MAX_VALUE-digit)/10) {
                return si==-1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            res=res*10+digit;
        }

        return (int)(res*si);
    }
}
