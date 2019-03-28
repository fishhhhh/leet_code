package solution.q0011;

public class Solution {

    public int maxArea(int[] height) {
        // 双指针
        int lIndex = 0;
        int rIndex = height.length - 1;
        int maxArea = 0;
        
        while (lIndex < rIndex) {
            maxArea = Math.max(maxArea, Math.min(height[lIndex], height[rIndex]) * (rIndex - lIndex));
            if (height[lIndex] < height[rIndex]) {
                lIndex++;
            } else {
                rIndex--;
            }
        }
        return maxArea;
    }
}
