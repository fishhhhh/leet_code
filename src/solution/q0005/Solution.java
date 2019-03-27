package solution.q0005;

public class Solution {
    
    public String longestPalindrome(String s) {
        
        int[] range = { 0, s.length() > 0 ? 1 : 0 };
        for (int i = 0; i < s.length(); i++) {
            i = longestPalindromeHelper(s, range, i);
        }
        return s.substring(range[0], range[1]);
    }
    
    private int longestPalindromeHelper(String s, int[] range, int i) {
        int start = i, end = i;
        while (end + 1 < s.length() && s.charAt(end) == s.charAt(end + 1)) {
            end++;
        }
        int result = end;
        while (start > 0 && end < s.length() - 1 && s.charAt(start - 1) == s.charAt(end + 1)) {
            start--;
            end++;
        }
        if (end - start + 1 > range[1] - range[0]) {
            range[0] = start;
            range[1] = end + 1;
        }
        return result;
    }
}
