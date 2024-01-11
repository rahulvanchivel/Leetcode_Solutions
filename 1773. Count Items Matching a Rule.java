class Solution {
    public int countMatches(List<List<String>> items, String rk, String rv) {
        int c=0;
        for(int i=0;i<items.size();i++)
        {
            if(rk.equals("type"))
            {
                if(items.get(i).get(0).equals(rv))
                {
                    c++;
                }
            }
            else if(rk.equals("color"))
            {
                if(items.get(i).get(1).equals(rv))
                {
                    c++;
                }
            }
            else if(rk.equals("name"))
            {
                if(items.get(i).get(2).equals(rv))
                {
                    c++;
                }
            }
        }
        return c;
    }
}
