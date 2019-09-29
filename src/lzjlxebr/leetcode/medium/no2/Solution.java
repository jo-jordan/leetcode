package lzjlxebr.leetcode.medium.no2;

import lzjlxebr.base.ListNode;

import java.math.BigInteger;

/**
 * Solution
 * <p>
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 执行用时 :18 ms
 * 内存消耗 :43.8 MB
 *
 * @author : lzjlxebr
 * @date : 2019-09-30 00:39
 **/
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger n1 = getNumberFromListNode(l1);
        BigInteger n2 = getNumberFromListNode(l2);
        return convertIntNumberToListNode(n1.add(n2));
    }

    private ListNode convertIntNumberToListNode(BigInteger i) {
        String s = String.valueOf(i);

        StringBuilder sb = new StringBuilder(s);

        ListNode last = null;
        for (int j = 0; j < sb.length(); j++) {
            int num = Character.getNumericValue(sb.charAt(j));

            if (last == null) {
                last = new ListNode(num);
            } else {
                ListNode cur = new ListNode(num);
                cur.next = last;

                last = cur;
            }
        }
        return last;
    }

    private BigInteger getNumberFromListNode(ListNode l1) {
        StringBuilder n = new StringBuilder();
        int cur = l1.val;
        n.append(cur);
        while (l1.next != null) {
            n.append(l1.next.val);

            l1 = l1.next;
        }
        n.reverse();

        return new BigInteger(n.toString());
    }
}
