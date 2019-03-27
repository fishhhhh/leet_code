package solution.q0008;

public class Solution {
    
    public int myAtoi(String str) {
        // Integer.MAX_VALUE = 2147483647
        // Integer.MIN_VALUE = -2147483648
        int result = 0;
        boolean isStart = false;
        Boolean symbol = null;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 32) { // 空格
                if (isStart) { // 中间的空格 跳出
                    break;
                } else {
                    continue; // 开头空格 继续
                }
            } else {
                isStart = true;
            }
            if (c >= 48 && c <= 57) {
                if (symbol == null) {
                    symbol = true;
                }
                int temp = c - 48; // -0的ASCII码即为对应的数值
                // 判断是否溢出
                if (symbol == true) {
                    // 正数
                    if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && temp > 7)) {
                        return Integer.MAX_VALUE;
                    }
                    result = result * 10 + temp;
                } else {
                    // 负数
                    if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && temp > 8)) {
                        return Integer.MIN_VALUE;
                    }
                    result = result * 10 - temp;
                }
            } else if (symbol == null && c == 43) {
                symbol = true;
            } else if (symbol == null && c == 45) {
                symbol = false;
            } else {
                break;
            }
        }
        return result;
    }
}
