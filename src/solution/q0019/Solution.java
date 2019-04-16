package solution.q0019;

import solution.define.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode l1 = head;
        ListNode l2 = head;
        
        for (int i = 0; i < n; i++) {
            l1 = l1.next;
        }
        if (l1 == null) {
            head = head.next;
        } else {
            while (l1.next != null) {
                l1 = l1.next;
                l2 = l2.next;
            }
            l2.next = l2.next.next;
        }
        return head;
    }
}
