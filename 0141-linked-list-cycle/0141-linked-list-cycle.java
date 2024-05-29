/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

 //Solution-1: using Hashmap
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;

        HashMap<ListNode, Integer> mpp = new HashMap<>();
        ListNode temp = head;

        while(temp != null){
            if(mpp.containsKey(temp)){
                return true;
            }
            else{
                mpp.put(temp, mpp.getOrDefault(temp, 0)+1);
            }
            temp = temp.next;
        }
        return false;
    }
}