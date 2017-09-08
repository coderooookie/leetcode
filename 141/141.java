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
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode next = head.next;
        ListNode nextN = head.next.next;
        while (nextN != null && nextN.next != null && next != nextN){
            next = next.next;
            nextN = nextN.next.next;
        }
        return nextN != next ?  false : true;
    }
}
