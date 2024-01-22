class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int[] r=new int[2];
        HashSet<Integer> s=new HashSet<>();
        for(int i:nums)
        {
            if(s.contains(i))
            {
                s.remove(i);
            }
            else
            {
                s.add(i);
            }
        }
        int j=0;
        for(int 
        i:s)
        {
            r[j]=i;
            j++;
        }
        return r;
    }
}
