class Solution {
    public int finalValueAfterOperations(String[] op) {
        int c=0;
        for(int i=0;i<op.length;i++)
        {
            String s=op[i];
            if(s.charAt(1)=='+')
            {
                c++;
            }
            else
            {
                c--;
            }
        }
        return c;

    }
}
