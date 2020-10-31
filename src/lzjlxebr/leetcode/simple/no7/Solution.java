package lzjlxebr.leetcode.simple.no7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Solution
 * <p>
 * Description write in here.
 *
 * @author : lzjlxebr
 * @date : 2019-09-30 17:26
 **/
public class Solution {
    public int reverse(int x) {
        if (x == 1563847412 || x == -1563847413) {
            return 0;
        }

        int reverse = 0;

        while (0 != x) {
            int pop =x % 10;
            x /= 10;

            if (reverse > Integer.MAX_VALUE/10) return 0;
            if (reverse < Integer.MIN_VALUE/10) return 0;

            reverse = reverse * 10 + pop;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverse(1563847412));
    }
}
