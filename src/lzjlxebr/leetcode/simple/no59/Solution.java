package lzjlxebr.leetcode.simple.no59;

/**
 * Solution
 * <p>
 * Description write in here.
 *
 * @author : lzjlxebr
 * @date : 2020-10-20 02:15
 **/
public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int len = nums.length;
        if (len <= 0) {
            return new int[0];
        }
        int[] f = new int[len + 1 - k];

        f[0] = nums[0];
        for(int i = 0; i <= len - k; i++) {
            f[i] = nums[i];
            for(int j = i + 1; j < i + k; j++) {
                f[i] = Math.max(f[i], nums[j]);
            }
        }
        return f;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7}, 3);


    }
}
