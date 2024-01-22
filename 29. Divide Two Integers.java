import java.math.BigInteger;
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor==-1)
        {
            return Integer.MAX_VALUE;
        }
        BigInteger d1=new BigInteger(Integer.toString(dividend));
        BigInteger d2=new BigInteger(Integer.toString(divisor));
        BigInteger r=d1.divide(d2);
        return r.intValue();
    }
}
