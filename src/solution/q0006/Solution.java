package solution.q0006;

public class Solution {
    
    public String convert(String s, int numRows) {
        return convert2(s, numRows);
    }
    
    /**
     * 解法1
     * 按照规则依次放入二维数组
     * 然后按行读取二维数组
     *
     * @param s       the s
     * @param numRows the num rows
     *
     * @return the string
     */
    private String convert1(String s, int numRows) {
        if (numRows <= 1) {
            return s;
        }
        // 计算二维数组需要的列数
        int numCols = 1;
        int len = numRows;
        boolean isRow = false;
        while (len < s.length()) {
            if (isRow) {
                len += numRows;
                numCols++;
                isRow = false;
            } else {
                for (int i = 0; i < numRows - 2; i++) {
                    len++;
                    numCols++;
                    if (len >= s.length()) {
                        break;
                    }
                }
                isRow = true;
            }
        }
        char[][] range = new char[numRows][numCols];
        int row = 0, col = 0;
        boolean isReverse = true;
        // 根据规则，将字符放入二维数组相应位置
        for (char c : s.toCharArray()) {
            if (isReverse) {
                range[row++][col] = c;
            } else {
                range[--row][++col] = c;
            }
            if (row == 0) {
                row++;
                isReverse = !isReverse;
            } else if (row == numRows) {
                row--;
                isReverse = !isReverse;
            }
        }
        // 生成新字符串
        StringBuffer result = new StringBuffer();
        for (row = 0; row < numRows; row++) {
            for (col = 0; col < numCols; col++) {
                if (range[row][col] != 0) {
                    result.append(range[row][col]);
                }
            }
        }
        return result.toString();
    }
    
    /**
     * 解法2
     *
     * n=4
     * k=列
     * 0     6       12	k(2n-2)
     * 1   5 7    11 13 k(2n-2)+1 && (k+1)(2n-2)-1
     * 2 4   8 10    14	k(2n-2)+2 && (k+1)(2n-2)-2 
     * 3     9       15	k(2n-2) + n - 1 || k(2n-2) + 3
     *
     * @param s       the s
     * @param numRows the num rows
     *
     * @return the string
     */
    private String convert2(String s, int numRows) {
        if (numRows <= 1) {
            return s;
        }
        StringBuilder result = new StringBuilder();
        int len = s.length();
        int key = 2 * numRows - 2;
        for (int i = 0; i < numRows; i++) {
            // i=行数
            for (int j = 0; i + j < len; j += key) {
                // j=n*k
                result.append(s.charAt(j + i));
                int temp = j + key - i;
                if (i != 0 && i != numRows - 1 && temp < len) {
                    result.append(s.charAt(temp));
                }
            }
        }
        return result.toString();
    }
}
