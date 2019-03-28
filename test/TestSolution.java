import org.junit.Assert;
import org.junit.Test;

import solution.define.ListNode;
import solution.q0001.Solution;

public class TestSolution {
    
    @Test
    public void q0001() {
        
        Solution solution = new Solution();
        Assert.assertArrayEquals(new int[] { 0, 1 }, solution.twoSum(new int[] { 2, 7, 11, 15 }, 9));
    }
    
    @Test
    public void q0002() {
        
        solution.q0002.Solution solution = new solution.q0002.Solution();
        ListNode x = new ListNode(2);
        x.next = new ListNode(4);
        x.next.next = new ListNode(3);
        
        ListNode y = new ListNode(5);
        y.next = new ListNode(6);
        y.next.next = new ListNode(4);
        ListNode result = solution.addTwoNumbers(x, y);
        StringBuilder target = new StringBuilder();
        do {
            target.append(result.val);
            result = result.next;
        } while (result != null);
        Assert.assertEquals(target.toString(), "708");
    }
    
    @Test
    public void q0003() {
        
        solution.q0003.Solution solution = new solution.q0003.Solution();
        Assert.assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
        Assert.assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
        Assert.assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
    }
    
    @Test
    public void q0004() {
        
        solution.q0004.Solution solution = new solution.q0004.Solution();
        Assert.assertEquals(2.0d, solution.findMedianSortedArrays(new int[] { 1, 3 }, new int[] { 2 }), 0);
        Assert.assertEquals(2.5d, solution.findMedianSortedArrays(new int[] { 1, 3 }, new int[] { 2, 4 }), 0);
    }
    
    @Test
    public void q0005() {
        
        solution.q0005.Solution solution = new solution.q0005.Solution();
        Assert.assertEquals("bab", solution.longestPalindrome("babad"));
        Assert.assertEquals("bb", solution.longestPalindrome("cbbd"));
    }
    
    @Test
    public void q0006() {
        
        solution.q0006.Solution solution = new solution.q0006.Solution();
        Assert.assertEquals("LCIRETOESIIGEDHN", solution.convert("LEETCODEISHIRING", 3));
        Assert.assertEquals("LDREOEIIECIHNTSG", solution.convert("LEETCODEISHIRING", 4));
    }
    
    @Test
    public void q0007() {
        
        solution.q0007.Solution solution = new solution.q0007.Solution();
        Assert.assertEquals(321, solution.reverse(123));
        Assert.assertEquals(-321, solution.reverse(-123));
        Assert.assertEquals(21, solution.reverse(120));
    }
    
    @Test
    public void q0008() {
        
        solution.q0008.Solution solution = new solution.q0008.Solution();
        Assert.assertEquals(42, solution.myAtoi("42"));
        Assert.assertEquals(-42, solution.myAtoi("   -42"));
        Assert.assertEquals(4193, solution.myAtoi("4193 with words"));
        Assert.assertEquals(0, solution.myAtoi("words and 987"));
        Assert.assertEquals(-2147483648, solution.myAtoi("-91283472332"));
    }
    
    @Test
    public void q0009() {
        
        solution.q0009.Solution solution = new solution.q0009.Solution();
        Assert.assertTrue(solution.isPalindrome(121));
        Assert.assertFalse(solution.isPalindrome(-121));
        Assert.assertFalse(solution.isPalindrome(10));
    }
    
    @Test
    public void q0010() {
        
        solution.q0010.Solution solution = new solution.q0010.Solution();
        Assert.assertFalse(solution.isMatch("aa", "a"));
        Assert.assertTrue(solution.isMatch("aa", "a*"));
        Assert.assertTrue(solution.isMatch("ab", ".*"));
        Assert.assertTrue(solution.isMatch("aab", "c*a*b"));
        Assert.assertFalse(solution.isMatch("mississippi", "mis*is*p*."));
    }
    
    @Test
    public void q0011() {
        
        solution.q0011.Solution solution = new solution.q0011.Solution();
        Assert.assertEquals(49, solution.maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));

    }

    @Test
    public void q0012() {
        
        solution.q0012.Solution solution = new solution.q0012.Solution();
        Assert.assertEquals("III", solution.intToRoman(3));
        Assert.assertEquals("IV", solution.intToRoman(4));
        Assert.assertEquals("IX", solution.intToRoman(9));
        Assert.assertEquals("LVIII", solution.intToRoman(58));
        Assert.assertEquals("MCMXCIV", solution.intToRoman(1994));
    }

    @Test
    public void q0013(){

        solution.q0013.Solution solution = new solution.q0013.Solution();
        Assert.assertEquals( 3, solution.romanToInt( "III" ) );
        Assert.assertEquals( 4, solution.romanToInt( "IV" ) );
        Assert.assertEquals( 9, solution.romanToInt( "IX" ) );
        Assert.assertEquals( 58, solution.romanToInt( "LVIII" ) );
        Assert.assertEquals( 1994, solution.romanToInt( "MCMXCIV" ) );
    }
}
