package solution.define;

import java.util.Objects;

public class ListNode {
    public int val;
    
    public ListNode next;

    public ListNode(int x) {
        this.val = x;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode build(String x) {
        if (null == x || x.length() == 0) return null;
        String[] arr = x.split("->");
        ListNode head = new ListNode(0);
        ListNode temp = head;
        for (String s : arr) {
            if (null == temp.next) temp.next = new ListNode(Integer.valueOf(s));
            temp = temp.next;
        }
        return head.next;
    }

    @Override
    public String toString() {
        
        ListNode temp = this;
        StringBuilder result = new StringBuilder();
        while (null != temp) {
            result.append(temp.val).append("->");
            temp = temp.next;
        }
        result.delete(result.length() - 2, result.length());
        return result.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListNode listNode = (ListNode) o;
        return val == listNode.val &&
                Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }
}
