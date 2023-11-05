package cn.leetcode.order1_10;

/**
 * Created by laoazhang on 20:01 14/08/2022
 */

public class Code02 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode();
        ListNode cursor = root;
        //进位符
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;
            int sumVal = l1Val + l2Val + carry;
            //求是否进位
            carry = sumVal / 10;
            ListNode sumNode = new ListNode(sumVal % 10);
            cursor.next = sumNode;
            cursor = sumNode;

            if (l1 != null) {l1 = l1.next;}
            if (l2 != null) {l2 = l2.next;}
            if (carry == 1) {
                cursor.next = new ListNode(carry);
            }
        }
        return root.next;
    }
}
