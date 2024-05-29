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
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode cycleStart = null, temp = head;
        HashMap<ListNode, Integer> mpp = new HashMap<>();

        while(temp != null){
            if(mpp.containsKey(temp)){
                cycleStart = temp;
                return cycleStart;
            }
            else{
                mpp.put(temp, 1);
            }
            temp = temp.next;
        }
        return cycleStart;
        
    }
}