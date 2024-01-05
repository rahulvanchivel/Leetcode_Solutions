class Solution {
    public int reverse(int x) {
        long num=0;
        int l=0;
        while(x!=0)
        {
            l=x%10;
            num+=l;
            num*=10;
            x/=10;
        }
        num/=10;
        if(num>Integer.MAX_VALUE || num<Integer.MIN_VALUE )
        {
            return 0;
        }
        if(x<0)
        {
            return (int)(-1*num);           
        }
        else
        {
            return (int)num;
        }
    }
}
