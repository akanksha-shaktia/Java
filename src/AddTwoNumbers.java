/**You are given two linked lists representing two non-negative numbers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit. 
 * Add the two numbers and return it as a linked list.
 *Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 *Output: 7 -> 0 -> 8
 * 
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     ListNode result = null;
     ListNode head = null;
     int sum =0, carry =0;
     while (l1 != null || l2!=null) {
         if(l1 != null && l2 !=null){
             sum = l1.val + l2.val + carry;
             l1 = l1.next;
         l2 = l2.next;
         }else if(l1!=null){
             sum = l1.val + carry;
             l1 = l1.next;
         }else if(l2!= null){
             sum = l2.val + carry;
             l2 = l2.next;
         }
         carry = sum/10;
            sum = sum%10;   
         if(result==null){
             result = new ListNode(sum);
             head = result;
         }else{
            result.next = new ListNode(sum);
            result = result.next;             
         }         
     }
    if(carry!=0){
         result.next = new ListNode(carry);
        result = result.next;
    }
    return head;
    }
}
