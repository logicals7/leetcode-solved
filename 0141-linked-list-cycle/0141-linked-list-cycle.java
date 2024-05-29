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
 //Using Floyd's cycle detection method - two point method - Tortoise Hare method
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;

        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}

/*


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
                mpp.put(temp, 1);
            }
            temp = temp.next;
        }
        return false;
    }
}

*/