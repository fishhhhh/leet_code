package solution.q0018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        if (nums.length < 4 || nums[0] > 0 || nums[nums.length - 1] < 0) {
            return result;
        } else if (nums[0] == 0 && nums[nums.length - 1] == target) {
            result.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
            return result;
        }

        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int l = j + 1;
                int r = nums.length - 1;
                while (l < r) {
                    int sum = nums[i] + nums[j] + nums[l] + nums[r];
                    if ( sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        while (l < r && nums[l] == nums[l + 1]) { // 避免重复
                            l++;
                        }
                        while (l < r && nums[r] == nums[r - 1]) { // 避免重复
                            r--;
                        }
                        l++;
                        r--;
                    } else if (sum < target) {
                        while (l < r && nums[l] == nums[l + 1]) { // 避免重复
                            l++;
                        }
                        l++;
                    } else {
                        while (l < r && nums[r] == nums[r - 1]) { // 避免重复
                            r--;
                        }
                        r--;
                    }
                }
            }
        }
        
        return result;
    }
}
