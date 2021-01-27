package cn.lvhaosir.brush.leetcode.topic1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    /*public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int[] result = new int[2];
        for (int i = 0; i < length; i++) {
            for (int k = i + 1; k < length; k++) {
                if (target == nums[i] + nums[k]) {
                    result[0] = i;
                    result[1] = k;
                    break;
                }
            }
        }
        return nums;
    }*/

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            int b = target - a;
            if (map.containsKey(b)) {
                return new int[]{map.get(b), i};
            }
            map.put(a, i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] ints = s.twoSum(new int[]{2, 7, 11, 15}, 9);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}