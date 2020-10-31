package lzjlxebr.leetcode.simple.no1195;

import java.util.function.IntConsumer;

/**
 * Solution
 * <p>
 * Description write in here.
 *
 * @author : lzjlxebr
 * @date : 2020-09-27 17:31
 **/
public class Solution {
    private int n;

    public Solution(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {

    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {

    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {

    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        if (n % 3 != 0 && n % 5 != 0) {
            printNumber.accept(n);
        }
    }
}
