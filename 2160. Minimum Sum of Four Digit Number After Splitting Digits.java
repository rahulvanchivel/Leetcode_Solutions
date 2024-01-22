class Solution {
    public int minimumSum(int num) {
        int a[]=new int[4];
        int i=0;
        while(num>0)
        {
            a[i]=num%10;
            num/=10;
            i++;
        }
        Arrays.sort(a);
        int s1=a[0]*10 + a[2];
        int s2=a[1]*10 + a[3];
        return s1+s2;
    }
}
