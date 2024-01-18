class Solution {
    public int[] rearrangeArray(int[] nums) {
        int p[]=new int[nums.length/2];
        int n[]=new int[nums.length/2];
        int a[]=new int[nums.length];
        int k=0;
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                p[j]=nums[i];
                j++;
            }
            else if(nums[i]>0)
            {
                n[k]=nums[i];
                k++;
            }
        }
        int x=0;
        int y=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                a[i]=n[x];
                x++;
            }
            else
            {
                a[i]=p[y];
                y++;
            }
        }
        return a;
    }
}
