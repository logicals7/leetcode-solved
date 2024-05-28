/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // Step 1: Copy the data from the next node to the current node
        node.val = node.next.val;

        // Step 2: Update the next pointer to bypass the next node
        node.next = node.next.next;
    }
}