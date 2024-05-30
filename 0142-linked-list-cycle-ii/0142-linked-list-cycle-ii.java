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

//Solution-2: using Floyd's Cycle Detection Algo/ Tortoise Hare Algo
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode slow = head, fast = head;
        // Continue loop while there are at least two more nodes to advance 'fast' pointer
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}

/*
 //Solution-1: Using HashMap
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

*/