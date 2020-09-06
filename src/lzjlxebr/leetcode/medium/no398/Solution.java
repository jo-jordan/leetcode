package lzjlxebr.leetcode.medium.no398;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Solution
 * <p>
 * 给定一个可能含有重复元素的整数数组，要求随机输出给定的数字的索引。 您可以假设给定的数字一定存在于数组中。
 *
 * 注意：
 * 数组大小可能非常大。 使用太多额外空间的解决方案将不会通过测试。
 *
 * 示例:
 *
 * int[] nums = new int[] {1,2,3,3,3};
 * Solution solution = new Solution(nums);
 *
 * // pick(3) 应该返回索引 2,3 或者 4。每个索引的返回概率应该相等。
 * solution.pick(3);
 *
 * // pick(1) 应该返回 0。因为只有nums[0]等于1。
 * solution.pick(1);
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/random-pick-index
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author : lzjlxebr
 * @date : 2020-09-03 11:18
 **/
class Solution {

    private final int[] nums;
    private final Random random = new Random();

    public Solution(int[] nums) {
        this.nums = nums;
    }

    public int pick(int target) {
        int n = 0;
        int index = 0;
        for(int i = 0;i < nums.length;i++)
            if(nums[i] == target){
                n++;
                if(random.nextInt() % n == 0) index = i;
            }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3};
        Solution solution = new Solution(nums);
        for (int i = 0; i < 1000; i++) {
            int r = solution.pick(3);
            System.out.println("Pick: " + r);
        }
    }
}
