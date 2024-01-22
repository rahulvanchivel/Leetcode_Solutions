class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] a=new int[2];
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=1;i<n;i++)
        {
            if(nums[i]==nums[i-1])
            {
                a[0]=nums[i];
                break;
            }
        }
        int t=0;
        t=n*(n+1)/2;
        int at=Arrays.stream(nums).sum();
        a[1]=t-(at-a[0]);
        return a;
    }
}
