package solution.q0021;

import solution.define.ListNode;

public class Solution {
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while (null != l1 && null != l2) {
            if (l1.val < l2.val) {
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            } else {
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            }
        }
        if (null == l1) {
            cur.next = l2;
        } else {
            cur.next = l1;
        }
        return head.next;
    }
}
