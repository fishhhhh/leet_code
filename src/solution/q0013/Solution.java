package solution.q0013;

public class Solution {
    
    public int romanToInt(String s) {
        int result = 0, temp = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            int n = switchNum(s.charAt(i));
            result = temp > n ? result - n : result + n;
            temp = n;
            
        }
        return result;
    }
    
    private int switchNum(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
