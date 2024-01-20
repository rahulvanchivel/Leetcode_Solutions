class Solution {
    public Boolean check(int[] a)
    {
        Arrays.sort(a);
        int d=a[1]-a[0];
        for(int i=2;i<a.length;i++)
        {
            if(a[i]-a[i-1]!=d)
            {
                return false;
            }
        }
        return true;
    }
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans=new ArrayList();
        for(int i=0;i<l.length;i++)
        {
            int a[]=new int[r[i]-l[i]+1];
            for(int j=0;j<a.length;j++)
            {
                a[j]=nums[l[i]+j];
            }
            ans.add(check(a));
        }
        return ans;
    }
}
