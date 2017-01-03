/**
 * Given a list, rotate the list to the right by k places, where k is non-negative.
 * For example:
 * Given 1->2->3->4->5->NULL and k = 2,
 * return 4->5->1->2->3->NULL.
 * 
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode p = head, res=null;
        int count = 0;
        while(p!=null){
            count++;
            p = p.next;
        }
        if(k==0 || count < 2 || k%count==0){
            return head;
        }
        count = count - k%count;
        ListNode q = null;
        while(count>0){
            if(res==null){
                res=head;
                q= res;
            }else{
                res.next = head;
                res = res.next;
            }
            head = head.next;
            count--;
        }
        res.next = null;
        ListNode fin = null, result = null;
        while(head!=null){
            if(result==null){
                result = head;
                fin = result;
            }else{
                result.next = head;
                result = result.next;
            }
            head = head.next;
        }
        result.next = q;
        return fin;
        
    }
}