package solution.q0022;

import java.util.ArrayList;

import java.util.List;

public class Solution {
    
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        append("", result, n, n);
        return result;
    }
    
    private void append(String temp, List<String> result, int left, int right) {
        if (left == 0 && right == 0) {
            if (temp.length() > 0) {
                result.add(temp);
            }
        } else {
            if (left > 0) {
                append(temp + '(', result, left - 1, right);
            }
            if (left < right && right > 0) {
                append(temp + ')', result, left, right - 1);
            }
        }
    }
}
