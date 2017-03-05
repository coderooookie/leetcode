/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
        ListNode* tmp = new ListNode(0);
        ListNode* ans = tmp;
        while (true){
            bool flag = (l1 != NULL && l2 != NULL);
            if (flag && l1->val > l2->val) { tmp->next = l2 ; l2 = l2->next; tmp = tmp->next;}
            else if (flag && l1->val <= l2->val) { tmp->next = l1; l1 = l1->next; tmp = tmp->next;}
            else if (l1 == NULL) {tmp->next = l2;break;}
            else if (l2 == NULL) {tmp->next = l1;break;}
        }
        return ans->next;
    }
    
};
