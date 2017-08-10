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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> ans = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        postOrder(root, ans, map);
        return ans;
    }

    public static String postOrder(TreeNode root, List list, Map<String,Integer> map){
        if (root == null) return "#";
        String serial = root.val + "," + postOrder(root.left, list, map) + "," + postOrder(root.right, list, map);
        if (map.getOrDefault(serial,0) == 1){list.add(root);}
        map.put(serial,map.getOrDefault(serial,0)+1);
        return serial;
    }
}