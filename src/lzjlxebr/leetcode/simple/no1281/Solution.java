package lzjlxebr.leetcode.simple.no1281;

/**
 * Solution
 * <p>
 * 给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
 * 输入：n = 234
 * 输出：15
 * 解释：
 * 各位数之积 = 2 * 3 * 4 = 24
 * 各位数之和 = 2 + 3 + 4 = 9
 * 结果 = 24 - 9 = 15
 *
 * 1 <= n <= 10^5
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author : lzjlxebr
 * @date : 2019-12-10 20:03
 **/
public class Solution {
    private static final int TEN_POW_5 = 10 * 10 * 10 * 10 * 10;

    public int subtractProductAndSum(int n) {
        boolean needRemoveZero = true;
        int base = TEN_POW_5;
        int mul = 1;
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int x = n % base / (base / 10);
            base /= 10;
            if (x == 0 && needRemoveZero) {
                continue;
            } else {
                needRemoveZero = false;
            }
            mul *= x;
            sum += x;
        }

        return mul - sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int r = solution.subtractProductAndSum(10001);
        int a = 1;
    }
}
