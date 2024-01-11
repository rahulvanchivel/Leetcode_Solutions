class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int c=0;
        int[] a=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<pivot)
            {
                a[c]=nums[i];
                c++;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==pivot)
            {
                a[c]=nums[i];
                c++;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>pivot)
            {
                a[c]=nums[i];
                c++;
            }
        }
        return a;
    }
}
