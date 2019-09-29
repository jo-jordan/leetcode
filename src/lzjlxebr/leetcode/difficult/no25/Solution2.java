package lzjlxebr.leetcode.difficult.no25;

import lzjlxebr.base.ListNode;

/**
 * Solution2
 * <p>
 * 给你一个链表，每 k 个节点一组进行翻转，请你返回翻转后的链表。
 * <p>
 * k 是一个正整数，它的值小于或等于链表的长度。
 * <p>
 * 如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-nodes-in-k-group
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * <p>
 *
 * 执行用时 :2 ms
 * 内存消耗 :36.6 MB
 *
 * @author : lzjlxebr
 * @date : 2019-09-28 15:30
 **/
public class Solution2 {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();

        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
//        node.next.next.next.next.next = new ListNode(6);
//        node.next.next.next.next.next.next = new ListNode(7);

        ListNode result =  solution2.reverseKGroup(node, 3);

        System.out.println("result: " + result.toString());
    }

    ListNode reverseKGroup(ListNode head, int k) {
        ListNode result = null;
        int kCount = 1;
        ListNode part = null;
        ListNode lastPart = null;
        if (k == 1) {
            return head;
        }
        while (head != null) {
            // 先获取当前节点
            ListNode curNode = new ListNode(head.val);
            curNode.next = null;
            // 将当前节点作为上一个节点的后继
            // 如果上一个节点为空，则直接赋值即可
            if (part == null) {
                part = curNode;
            } else {
                curNode.next = part;
                part = curNode;
            }

            if (kCount == k) {
                // 当循环到k时，将分组的节点暂存到数组中
                if (result == null) {
                    result = part;
                } else {
                    link(result, part);
                }

                kCount = 0;
                part = null;
                lastPart = null;
            } else {
                lastPart = part;
            }

            kCount++;
            head = head.next;
        }

        if (lastPart != null && result != null) {
            link(result, reverse(lastPart));
        }

        return result == null ? reverse(lastPart) : result;
    }

    private ListNode reverse(ListNode head) {
        ListNode part = null;
        while (head != null) {
            // 先获取当前节点
            ListNode curNode = new ListNode(head.val);
            curNode.next = null;
            // 将当前节点作为上一个节点的后继
            // 如果上一个节点为空，则直接赋值即可
            if (part == null) {
                part = curNode;
            } else {
                curNode.next = part;
                part = curNode;
            }
            head = head.next;
        }
        return part;
    }


    private void link(ListNode result, ListNode part){
        if (result.next != null) {
            link(result.next, part);
        } else {
            result.next = part;
        }
    }
}
