/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode cur=head;
        ListNode pre=null;
        while(cur!=null)
        {
            if(pre!=null && cur!=null)
            {
                int gcd=gcd(pre.val,cur.val);
                ListNode newNode=new ListNode(gcd,cur);
                pre.next=newNode;
            }
            pre=cur;
            cur=cur.next;
        }
        return head;
    }
    public int gcd(int n1,int n2)
    {
        if(n2==0)
        {
            return n1;
        }
        return gcd(n2,n1%n2);
    }
}
