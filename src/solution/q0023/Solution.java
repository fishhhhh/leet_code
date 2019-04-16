package solution.q0023;

import solution.define.ListNode;

public class Solution {
    
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        } else {
            return mergeKLists(lists, 0, lists.length - 1);
        }
    }
    
    private ListNode mergeKLists(ListNode[] lists, int begin, int end) {
        if (begin < end) {
            int mid = (end + begin) >> 1; // = (end + begin) / 2
            return mergeTwoLists(mergeKLists(lists, begin, mid), mergeKLists(lists, mid + 1, end));
        } else if (begin == end) {
            return lists[begin];
        } else {
            return null;
        }
    }
    
    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
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
