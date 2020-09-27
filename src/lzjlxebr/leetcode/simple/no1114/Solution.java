package lzjlxebr.leetcode.simple.no1114;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Solution
 * <p>
 * Description write in here.
 *
 * @author : lzjlxebr
 * @date : 2020-09-27 16:46
 **/
public class Solution {
    private static final AtomicInteger count = new AtomicInteger(0);

    public Solution() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        count.incrementAndGet();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (count.get() != 1) {}

        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        count.incrementAndGet();
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (count.get() != 2) {}

        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
//        count.set(0);
    }



    public static void main(String[] args) throws InterruptedException {

        hereWeGo(new int[]{1, 3, 2});
    }

    public static void hereWeGo(int[] order) {
        Solution solution = new Solution();
        for (int i : order) {
            switch (i) {
                case 1: {
                    new Thread(() -> {
                        try {
                            solution.first(() -> {
                                System.out.print("first");
                            });
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }).start();

                    break;
                }
                case 2: {
                    new Thread(() -> {
                        try {
                            solution.second(() -> {
                                System.out.print("second");
                            });
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }).start();

                    break;
                }
                default: {
                    new Thread(() -> {
                        try {
                            solution.third(() -> {
                                System.out.print("third");
                            });
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }).start();

                    break;
                }
            }
        }
    }
}
