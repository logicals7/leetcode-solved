class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode dummyHead = new ListNode(-1);
        ListNode p3 = dummyHead;
        int carry = 0;

        while (p1 != null || p2 != null || carry != 0) {
            int sum = carry;
            if (p1 != null) {
                sum += p1.val;
                p1 = p1.next;
            }
            if (p2 != null) {
                sum += p2.val;
                p2 = p2.next;
            }
            carry = sum / 10;
            p3.next = new ListNode(sum % 10);
            p3 = p3.next;
        }

        return dummyHead.next;
    }
}
