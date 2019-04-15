package solution.q0017;

import java.util.ArrayList;

import java.util.List;

public class Solution {
    
    private char[][] arr = new char[][] { {}, {}, { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' },
            { 'j', 'k', 'l' }, { 'm', 'n', 'o' }, { 'p', 'q', 'r', 's' }, { 't', 'u', 'v' }, { 'w', 'x', 'y', 'z' } };
    
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length() > 0) {
            print(result, digits, 0, "");
        }
        return result;
    }
    
    private void print(List<String> result, String s, int i, String temp) {
        
        char[] chars = arr[s.charAt(i) - 48];
        if (i < s.length() - 1) {
            for (char c : chars) {
                print(result, s, i + 1, temp + c);
            }
        } else {
            for (char c : chars) {
                result.add(temp + c);
            }
        }
    }
}
