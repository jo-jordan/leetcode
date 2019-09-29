package lzjlxebr.leetcode.difficult.no25;

import lzjlxebr.base.ListNode;

import java.util.LinkedList;
import java.util.List;

/**
 * Solution
 *
 * 给你一个链表，每 k 个节点一组进行翻转，请你返回翻转后的链表。
 *
 * k 是一个正整数，它的值小于或等于链表的长度。
 *
 * 如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-nodes-in-k-group
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * <p>
 * 我的思路：
 * 1，首先是把将给定的链表存放到java自带的链表中
 * 2，然后分k的奇偶，k个元素为一组进行翻转，奇数翻转到每组的k/2+1处即可
 * 偶数翻转到k/2即可；
 * 3，将翻转完毕的链表再转换为简单链表
 * 执行用时 :36 ms
 * 内存消耗 :38.9 MB
 *
 * @author : lzjlxebr
 * @date : 2019-09-28 15:18
 **/
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        List<ListNode> list = new LinkedList<>();

        while(head != null) {
            list.add(head);
            ListNode temp = head.next;
            head.next = null;
            head = temp;
        }

        int size = list.size();
        if (k != 1 && k <= size) {
            int times = k / 2;
            if (k % 2 == 1) {
                times++;
            }
            int m = 1;
            int totalCount = 0;
            int count = 0;
            for (int i = 0; i < size; i++) {

                count++;
                int index = k * m - i - 1;
                if (index <= size - 1) {
                    ListNode needToBeReplace = list.get(i);
                    ListNode nodeToReplace = list.get(index);
                    list.set(i, nodeToReplace);
                    list.set(index , needToBeReplace);
                } else {
                    break;
                }
                if (count == times) {
                    count = 0;
                    m+=2;
                    totalCount++;
                    i = k * totalCount - 1;
                }
            }
        }


        ListNode last = null;
        for (int j = size - 1; j > -1; j--) {
            ListNode node = list.get(j);

            if (last == null) {
                last = new ListNode(node.val);
            } else {
                ListNode cur = new ListNode(node.val);
                cur.next = last;

                last = cur;
            }
        }

        return last;
    }
}
