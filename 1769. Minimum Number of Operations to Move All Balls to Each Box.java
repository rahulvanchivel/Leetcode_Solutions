class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        char[] ch=boxes.toCharArray();
        int[] r=new int[n];
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(i!=j && ch[j]=='1')
                {
                    c+=Math.abs(i-j);
                }
                r[i]=c;
            }
        }
        return r;
    }
}
