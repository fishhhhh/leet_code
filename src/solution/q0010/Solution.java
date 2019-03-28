package solution.q0010;

public class Solution {

    public boolean isMatch(String s, String p) {
        // TODO 动态规划
        boolean[][] memory = new boolean[s.length() + 1][p.length() + 1];
        memory[0][0] = true;
        for (int i = 0; i <= s.length(); i++) {
            for (int j = 1; j <= p.length(); j++) {
                if (p.charAt(j - 1) == '*') {
                    memory[i][j] = memory[i][j - 2] || (i > 0
                            && (s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.') && memory[i - 1][j]);
                } else {
                    memory[i][j] = i > 0
                            && (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.') && memory[i - 1][j - 1];
                }
            }
        }
        return memory[s.length()][p.length()];
    }
}
