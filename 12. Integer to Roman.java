class Solution {
    public String intToRoman(int n) {
        StringBuilder s=new StringBuilder();
        int[] d={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] str={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        for(int i=0;i<d.length;i++)
        {
            while(n>=d[i])
            {
                n-=d[i];
                s.append(str[i]);
            }
        }
        return s.toString();
    }
}
