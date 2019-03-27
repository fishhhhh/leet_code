package solution.q0009;

public class Solution {
    
    public boolean isPalindrome(int x) {
        
        return isPalindrome2(x);
    }
    
    /**
     * 解法1
     * 字符串
     *
     * @param x the x
     *
     * @return the boolean
     */
    private boolean isPalindrome1(int x) {
        String oldStr = String.valueOf(x);
        String newStr = new StringBuffer(oldStr).reverse().toString();
        return newStr.equals(oldStr);
    }
    
    /**
     * 解法2
     * 翻转一半数字
     *
     * @param x the x
     *
     * @return the boolean
     */
    private boolean isPalindrome2(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        int temp = 0;
        while (x > temp) {
            int t = x % 10;
            temp = temp * 10 + t;
            x = x / 10;
        }
        return x == temp || x == temp / 10;
    }
}
