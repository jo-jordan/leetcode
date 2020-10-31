package lzjlxebr.leetcode.medium.no24;

/**
 * Solution
 * <p>
 * Description write in here.
 *
 * @author : lzjlxebr
 * @date : 2020-10-13 17:34
 **/
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode result = null;

        ListNode prevNode;
        while (null != head) {
            ListNode nextNode = head.next;

            ListNode nextNextNode = nextNode.next;

            // 首先将当前的节点curNode置为下下个节点的前节点
            head.next = nextNextNode;
            // 然后将下一个节点nextNode置为当前节点的前节点
            nextNode.next = head;

            head = nextNextNode;

            if (null == result) {
                result = nextNode;
            } else {
                prevNode = nextNode.next;
                ListNode resultNode = result;
                while (resultNode != null) {
                    resultNode = resultNode.next;
                }
                resultNode = prevNode;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4)
                        )
                )
        );

        Solution solution = new Solution();
        ListNode r = solution.swapPairs(listNode);

        IFoo foo = new Foo();
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }


}

interface IFoo {

}

abstract class AFoo implements IFoo {

}

class Foo extends AFoo {

}
