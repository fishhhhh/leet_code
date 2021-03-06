package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
    public void q0013() {
        
        solution.q0013.Solution solution = new solution.q0013.Solution();
        Assert.assertEquals(3, solution.romanToInt("III"));
        Assert.assertEquals(4, solution.romanToInt("IV"));
        Assert.assertEquals(9, solution.romanToInt("IX"));
        Assert.assertEquals(58, solution.romanToInt("LVIII"));
        Assert.assertEquals(1994, solution.romanToInt("MCMXCIV"));
    }
    
    @Test
    public void q0014() {
        
        solution.q0014.Solution solution = new solution.q0014.Solution();
        Assert.assertEquals("fl", solution.longestCommonPrefix(new String[] { "flower", "flow", "flight" }));
        Assert.assertEquals("", solution.longestCommonPrefix(new String[] { "dog", "racecar", "car" }));
    }
    
    @Test
    public void q0015() {
        
        solution.q0015.Solution solution = new solution.q0015.Solution();
        Assert.assertEquals( new ArrayList< List<Integer> >( ){{
            add( new ArrayList<Integer>(  ){{
                add( -1 );
                add( -1 );
                add( 2 );
            }} );
            add( new ArrayList<Integer>(  ){{
                add( -1 );
                add( 0 );
                add( 1 );
            }} );
        }}, solution.threeSum( new int[]{-1, 0, 1, 2, -1, -4} ));
    }

    @Test
    public void q0016() {

        solution.q0016.Solution solution = new solution.q0016.Solution();
        Assert.assertEquals(2, solution.threeSumClosest(new int[] { -1, 2, 1, -4 }, 1));
        Assert.assertEquals(-1, solution.threeSumClosest(new int[] { 1, 1, -1, -1, 3 }, -1));
    }

    @Test
    public void q0017() {
        
        solution.q0017.Solution solution = new solution.q0017.Solution();
        List<String> list = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        Assert.assertEquals(list, solution.letterCombinations("23"));
    }
    
    @Test
    public void q0018() {
        
        solution.q0018.Solution solution = new solution.q0018.Solution();
        List<List<Integer>> result1 = Arrays
                .asList(Arrays.asList(-2, -1, 1, 2), Arrays.asList(-2, 0, 0, 2), Arrays.asList(-1, 0, 0, 1));
        Assert.assertEquals(result1, solution.fourSum(new int[] { 1, 0, -1, 0, -2, 2 }, 0));
        
        List<List<Integer>> result2 = Arrays.asList(Arrays.asList(-3, -1, 2, 4));
        Assert.assertEquals(result2, solution.fourSum(new int[] { -3, -1, 0, 2, 4, 5 }, 2));
        
        List<List<Integer>> result3 = Arrays.asList(Arrays.asList(-3, -2, 2, 3),
                Arrays.asList(-3, -1, 1, 3),
                Arrays.asList(-3, 0, 0, 3),
                Arrays.asList(-3, 0, 1, 2),
                Arrays.asList(-2, -1, 0, 3),
                Arrays.asList(-2, -1, 1, 2),
                Arrays.asList(-2, 0, 0, 2),
                Arrays.asList(-1, 0, 0, 1));
        Assert.assertEquals(result3, solution.fourSum(new int[] { -3, -2, -1, 0, 0, 1, 2, 3 }, 0));
    }
    
    @Test
    public void q0019() {
        
        solution.q0019.Solution solution = new solution.q0019.Solution();
        ListNode param = new ListNode(1);
        param.next = new ListNode(2);
        param.next.next = new ListNode(3);
        param.next.next.next = new ListNode(4);
        param.next.next.next.next = new ListNode(5);
        
        Assert.assertEquals("1->2->3->5", solution.removeNthFromEnd(param, 2).toString());
        
        Assert.assertNull(solution.removeNthFromEnd(new ListNode(1), 1));
        ListNode param2 = new ListNode(1);
        param2.next = new ListNode(2);
        Assert.assertEquals("2", solution.removeNthFromEnd(param2, 2).toString());
    }
    
    @Test
    public void q0020() {
        
        solution.q0020.Solution solution = new solution.q0020.Solution();
        Assert.assertTrue(solution.isValid("()"));
        Assert.assertTrue(solution.isValid("()[]{}"));
        Assert.assertFalse(solution.isValid("(]"));
        Assert.assertFalse(solution.isValid("([)]"));
        Assert.assertTrue(solution.isValid("{[]}"));
        Assert.assertFalse(solution.isValid("]}"));
    }
    
    @Test
    public void q0021() {
        
        solution.q0021.Solution solution = new solution.q0021.Solution();
        ListNode param1 = new ListNode(1);
        param1.next = new ListNode(2);
        param1.next.next = new ListNode(4);
        ListNode param2 = new ListNode(1);
        param2.next = new ListNode(3);
        param2.next.next = new ListNode(5);
        Assert.assertEquals("1->1->2->3->4->5", solution.mergeTwoLists(param1, param2).toString());
    }
    
    @Test
    public void q0022() {
        
        solution.q0022.Solution solution = new solution.q0022.Solution();
        Assert.assertEquals(Arrays.asList("()"), solution.generateParenthesis(1));
        Assert.assertEquals(Arrays.asList("(())", "()()"), solution.generateParenthesis(2));
        Assert.assertEquals(Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()"),
                solution.generateParenthesis(3));
    }
    
    @Test
    public void q0023() {
        
        solution.q0023.Solution solution = new solution.q0023.Solution();
        ListNode param1 = new ListNode(1);
        param1.next = new ListNode(4);
        param1.next.next = new ListNode(5);
        ListNode param2 = new ListNode(1);
        param2.next = new ListNode(3);
        param2.next.next = new ListNode(4);
        ListNode param3 = new ListNode(2);
        param3.next = new ListNode(6);
        Assert.assertEquals("1->1->2->3->4->4->5->6",
                solution.mergeKLists(new ListNode[] { param1, param2, param3 }).toString());
    }

    @Test
    public void q0024() {
        solution.q0024.Solution solution = new solution.q0024.Solution();
        Assert.assertEquals(null, solution.swapPairs(null));
        Assert.assertEquals(ListNode.build("1"), solution.swapPairs(ListNode.build("1")));
        Assert.assertEquals(ListNode.build("2->1->4->3"), solution.swapPairs(ListNode.build("1->2->3->4")));
    }

    @Test
    public void q0025() {
        solution.q0025.Solution solution = new solution.q0025.Solution();
//        Assert.assertEquals(null, solution.reverseKGroup(null, 1));
//        Assert.assertEquals(ListNode.build("1->2->3"), solution.reverseKGroup(ListNode.build("1->2->3"), 1));
        Assert.assertEquals(ListNode.build("3->2->1"), solution.reverseKGroup(ListNode.build("1->2->3"), 3));
    }
}
