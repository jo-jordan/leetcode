package lzjlxebr.base;

/**
 * ListNode
 * <p>
 * Description write in here.
 *
 * @author : lzjlxebr
 * @date : 2019-09-28 15:18
 **/
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("{");
        sb.append("\"val\":").append(val);
        sb.append(", \"next\":").append(next);
        sb.append('}');
        return sb.toString();
    }
}
