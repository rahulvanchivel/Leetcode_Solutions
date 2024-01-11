class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        int n1=arr1.length;
        int n2=arr2.length;
        int r1=0;
        int r2=0;
        for(int i=0;i<n1;i++)
        {
            r1=r1^arr1[i];
        }
        for(int i=0;i<n2;i++)
        {
            r2=r2^arr2[i];
        }
        return r1 & r2;
    }
}
