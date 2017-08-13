/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
    	int len = 0;
    	ListNode tail = head;
    	while (tail != null){
    		len++;
    		tail = tail.next;
    	}
        if (len < k || k <= 1){return head;}
        Stack<ListNode> s = new Stack();
        for (int i = 1; i <= len; i++){
        	s.add(head);
        	head = head.next;
        	if (i%k == 0 && i+k > len){break;}
        }
        while (!s.isEmpty()){
        	int count = 0;
        	ListNode tmpHead = s.peek();
        	while (count < k){
        		ListNode tmp = s.pop();
        		count++;
        		if (count == k){tmp.next = head;}else{tmp.next = s.isEmpty() ? null : s.peek();}
        	}
        	head = tmpHead;
        }
        return head;
    }
}
