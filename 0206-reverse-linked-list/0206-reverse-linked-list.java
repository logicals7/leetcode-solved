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

//Solution-3: recursive approach
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode newHead = reverseList(head.next);
        ListNode nextNode = head.next;
        nextNode.next = head; //or we could simply write head.next.next = head;
        head.next = null;

        return newHead;
    }
}



/*
 //Solution-2: using iterative method
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp = head, prevNode = null;
        while(temp != null){
            ListNode nextNode = temp.next;
            temp.next = prevNode;
            prevNode = temp;

            temp = nextNode;
        }
        head = prevNode;
        return head;
    }
}

*/



/*
//Solution -1 : using stack
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode temp = head;
        Stack<ListNode> st = new Stack<>();

        while(temp != null){
            st.push(temp);
            temp = temp.next;
        }

        //The linked list is 1 -> 2 -> 3 -> 4 -> 5.
        //We push all nodes onto the stack, so the stack now contains [1, 2, 3, 4, 5] 
        //(with 5 being the top element).

        //set the new head
        //head = st.pop(); // Pops the top element from the stack and sets it as the new head
        //temp = head;     // temp also points to the new head
        
        //After this line, head and temp both point to the node with value 5 
        //(which was the last node in the original list).

        //The stack now contains [1, 2, 3, 4].
        //Reverse the List by Popping Elements:

        //while (!st.isEmpty()) {
        //    temp.next = st.pop(); // Set the next of the current node to the node popped from the stack
        //    temp = temp.next;     // Move temp to the next node
        //}

        head = st.pop();
        temp = head;
        while(!st.isEmpty()){
            temp.next = st.pop();
            temp = temp.next;
        }
        // Set the next of the last node to null
        temp.next = null;

        return head;
        
    }
}
*/