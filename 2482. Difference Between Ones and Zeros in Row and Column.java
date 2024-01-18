class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;   
        int or[]=new int[r];
        int oc[]=new int[c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                or[i]+=grid[i][j];
                oc[j]+=grid[i][j];
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                grid[i][j]=2*(or[i]+oc[j])-r-c;
            }
        }
        return grid;
    }
}
