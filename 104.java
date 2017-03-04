/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {return 0;}
        int leftDepth = 0, rightDepth = 0;
        try {leftDepth = maxDepth(root.left);} catch (Exception ex){}
        try {rightDepth = maxDepth(root.right);} catch (Exception ex){}
        return Math.max(leftDepth,rightDepth) + 1;
    }
}
