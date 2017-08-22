/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int pathSum(TreeNode root, int sum) {
        int ans = addPathSum(root,sum,false);
        return ans;
    }
    
    public static int addPathSum(TreeNode root, int sum, boolean flag){
        int ans = 0;
        if (root == null) {return ans;}
        if (root.val == sum){++ans;}
        if (!flag){
            ans += addPathSum(root.left, sum, false);        
            ans += addPathSum(root.right, sum, false);
        }
        ans += addPathSum(root.left, sum-root.val,true);
        ans += addPathSum(root.right, sum-root.val,true);
        return ans;
    }
}