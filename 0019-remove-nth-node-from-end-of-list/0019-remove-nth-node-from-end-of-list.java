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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null) return null;
        ListNode temp = head;
        //counting the total number of nodes
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }   

        //if there are 5 nodes in total & we have to delete the 2nd node from back
        //that means we have to delete the count - n + 1 = 5 - 2 + 1 = 4th node from start
        //so traverse till the 3rd node
        int nodeFromStart = count - n;
        temp = head;
        for(int i = 1; i < nodeFromStart; i++){
            temp = temp.next;
        }



        //deleting the 4th node from start
        //if the delete node is head node
        if(nodeFromStart == 0) return head.next;
        //if the deletion node is tail node
        if(n == 1) temp.next = null;
        else temp.next = temp.next.next;
        return head;
    }
}