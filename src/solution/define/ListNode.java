package solution.define;

public class ListNode {
    public int val;
    
    public ListNode next;
    
    public ListNode(int x) {
        val = x;
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
}
