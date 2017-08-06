/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack();
        Stack<Integer> s2 = new Stack();
        while (l1 != null){s1.push(l1.val);l1 = l1.next;}
        while (l2 != null){s2.push(l2.val);l2 = l2.next;}
        int sum = 0;
        ListNode ans = null;
        while (!s1.empty() || !s2.empty()){
            if (!s1.empty()){sum += s1.pop();}
            if (!s2.empty()){sum += s2.pop();}
            ListNode l = new ListNode(sum % 10);
            if (ans == null) ans = l;
            else{l.next = ans; ans = l;}
            sum /= 10;
        }
        if (sum != 0){
            ListNode l = new ListNode(sum);
            l.next = ans;
            ans = l;
        }
        return ans;
    }
}