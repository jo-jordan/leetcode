package lzjlxebr.lintcode.change_coins;

/**
 * Solution
 * <p>
 * Description write in here.
 *
 * 给定2，5，7三枚类型硬币
 * 现需要使用上面的三种硬币组成27块钱，求出最少的硬币数量
 *
 * f(27) = min(f(27 - 2) + 1, f(27 - 5) + 1, f(27 - 7) + 1)
 *
 *
 * 给定N种类型的硬币
 * 现需要使用上面的N种硬币组成M块钱，求出最少的硬币数量
 *
 * f(M) = min(f(M - A[0]) + 1,..., f(M - A[N - 1]) + 1)
 *
 * @author : lzjlxebr
 * @date : 2020-10-20 01:16
 **/
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int count = solution.getNumber(new int[]{2, 5, 6}, 27);
    }

    public int getNumber(int[] A, int M) {
        int[] f = new int[M + 1]; // need to use M as index of f
        int N = A.length;

        f[0] = 0;

        for (int i = 1; i <= M; i++) {
            f[i] = Integer.MAX_VALUE;

            for (int k : A) {
                if (i >= k && f[i - k] != Integer.MAX_VALUE)
                    f[i] = Math.min(f[i - k] + 1, f[i]);
            }
        }

        if (f[M] == Integer.MAX_VALUE) {
            return -1;
        }

        return f[M];
    }
}
