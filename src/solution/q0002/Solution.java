package solution.q0002;

import solution.define.ListNode;

public class Solution {
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode header = new ListNode(0), ll1 = l1, ll2 = l2, tempNode = header;
        int temp = 0;
        while (ll1 != null || ll2 != null) {
            int sum = (ll1 != null ? ll1.val : 0) + (ll2 != null ? ll2.val : 0) + temp;
            tempNode.next = new ListNode(sum % 10);
            temp = sum / 10;
            tempNode = tempNode.next;
            ll1 = ll1 != null ? ll1.next : null;
            ll2 = ll2 != null ? ll2.next : null;
        }
        if (temp != 0) {
            tempNode.next = new ListNode(1);
        }
        return header.next;
    }
}
