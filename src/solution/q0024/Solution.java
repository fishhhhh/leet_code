package solution.q0024;

import solution.define.ListNode;

public class Solution {

    public ListNode swapPairs(ListNode head) {
        if (null == head || null == head.next) return head;
        // 1->2->xxxxxx = 2->1->xxxxxx

        // 2
        ListNode next = head.next;
        // xxxxx
        head.next = swapPairs(next.next);
        // 1
        next.next = head;
        return next;
    }
}
