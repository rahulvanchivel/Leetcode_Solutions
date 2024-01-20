class Solution {
    public String sortVowels(String s) {
         StringBuilder t = new StringBuilder();
        int[] vowelIndices = new int[s.length()];
        int index=0;
        for (int i=0;i<s.length();i++) 
        {
            char ch=s.charAt(i);
            if (isVowel(ch)) 
            {
                t.append(ch);
                vowelIndices[index++]=i;
            }
        }
        char[] c=t.toString().toCharArray();
        Arrays.sort(c);
        StringBuilder res=new StringBuilder(s);
        int j=0;
        for (int i=0;i<c.length;i++) {
            res.setCharAt(vowelIndices[i],c[j++]);
        }
        return res.toString();
    }

     private boolean isVowel(char ch)
    {
         return "aeiouAEIOU".indexOf(ch)!=-1;
    }
}
