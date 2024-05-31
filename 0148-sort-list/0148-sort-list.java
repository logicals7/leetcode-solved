/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode findMid(ListNode head){
        //fast is head.next sothat mid element matches as per mergesort requirements
        ListNode slow = head, fast = head.next, mid = null; 
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        mid = slow;
        return mid;
    }

    public ListNode mergeTwoLists(ListNode leftHead, ListNode rightHead){
        ListNode lh = leftHead, rh = rightHead;
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;

        //when both list has elements
        while(lh != null && rh != null){
            if(lh.val <= rh.val){
                temp.next = lh;
                lh = lh.next;
            }
            else{
                temp.next = rh;
                rh = rh.next;
            }
            temp = temp.next;
        }

        // If there are remaining nodes in either list, append them
        if (lh != null) temp.next = lh;
        else temp.next = rh;

        return dummyNode.next; 
    }


    public ListNode sortList(ListNode head) {
        // Base case: if the list is empty or has only one node, it's already sorted
        if (head == null || head.next == null) return head;

        ListNode mid = findMid(head);
        ListNode leftHead = head;
        ListNode rightHead = mid.next;
        //to separte the two LL we need to point mid.next to null by breaking the connection bw two LL
        mid.next = null;

        leftHead = sortList(leftHead);
        rightHead = sortList(rightHead);
        return mergeTwoLists(leftHead, rightHead);
    }
}