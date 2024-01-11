class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] a=new int[nums.length];
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            ans.add(index[i],nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            a[i]=ans.get(i);
        }
        return a;
    }
}
