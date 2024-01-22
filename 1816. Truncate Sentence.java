class Solution {
    public String truncateSentence(String s, int k) {
       if(s.length()<k)
       {
           return s;
       }
       int c=0;
       int i=0;
       for(i=0;i<s.length();i++)
       {
           if(s.charAt(i)==' ')
           {
               c++;
           }
           if(c==k)
           {
               break;
           }
       }
       return s.substring(0,i);
    }
}
