package solution.q0012;

public class Solution {
    
    private char[] chars = {0, 0, 'M', 'D', 'C', 'L', 'X', 'V', 'I'};

    public String intToRoman(int num) {
        if (num >= 4000 || num < 1) {
            return null;
        }
        StringBuffer result = new StringBuffer();
        int temp = 1000;
        int index = 0;
        while (num != 0) {
            if (num >= temp) {
                result = append(result, num / temp, chars[index + 2], chars[index + 1], chars[index]);
                num %= temp;
            }
            index += 2;
            temp /= 10;
        }
        
        return result.toString();
    }
    
    private StringBuffer append(StringBuffer s, int num, char key1, char key5, char key10) {
        switch (num) {
            case 1:
            case 2:
            case 3:
                for (int i = 0; i < num; i++) {
                    s.append(key1);
                }
                return s;
            case 4:
                return s.append(key1).append(key5);
            case 5:
                return s.append(key5);
            case 6:
            case 7:
            case 8:
                s.append(key5);
                int count = num % 5;
                for (int i = 0; i < count; i++) {
                    s.append(key1);
                }
                return s;
            case 9:
                return s.append(key1).append(key10);
            case 10:
                return s.append(key10);
            default:
                return s;
        }
    }
}
