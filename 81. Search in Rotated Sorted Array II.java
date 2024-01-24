class Solution {
    public boolean search(int[] nums, int target) {
        boolean ans=true;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                ans=true;
                break;
            }
            else
            {
               ans = false;
            }
        }
        return ans;
    }
}
