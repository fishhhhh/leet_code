package solution.q0014;

public class Solution {
    
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        char c = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                if (j == 0) {
                    c = strs[j].charAt(i);
                } else if (i >= strs[j].length() || c != strs[j].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        
        return strs[0];
    }
}
