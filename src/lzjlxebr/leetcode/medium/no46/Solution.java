package lzjlxebr.leetcode.medium.no46;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Solution
 * <p>
 * 给定一个没有重复数字的序列，返回其所有可能的全排列。
 *
 * 示例:
 *
 * 输入: [1,2,3]
 * 输出:
 * [
 *   [1,2,3],
 *   [1,3,2],
 *   [2,1,3],
 *   [2,3,1],
 *   [3,1,2],
 *   [3,2,1]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/permutations
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author : lzjlxebr
 * @date : 2019-12-10 22:12
 **/
public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int total = calTotalNumber(nums);

        List<Integer> list = new ArrayList<>(total);
        for (int i = 0; i < total; i++) {

        }

        return null;
    }

    private int calTotalNumber(int[] nums) {
        int x = 1;
        for (int i = 1; i <= nums.length; i++) {
            x *= i;
        }
        return x;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.permute(new int[]{1, 2, 3, 4, 5});
    }
}
