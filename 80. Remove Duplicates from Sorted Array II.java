class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        int a=1;
        int ind=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]==nums[i])
            {
                a++;
            }
            else
            {
                a=1;
            }
            if(a<3)
            {
                nums[ind]=nums[i];
                ind++;
            }
        }
        return ind;
        
    }
}
