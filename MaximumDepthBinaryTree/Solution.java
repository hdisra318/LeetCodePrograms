/**
 * Problem 104. Maximum Depth of Binary Tree
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        
        if(root == null)
            return 0;
        
        if(root.left == null && root.right == null)
            return 1;
        
        int depthLeft = maxDepth(root.left);
        int depthRight = maxDepth(root.right);
        
        int maxDepth = depthLeft >= depthRight ? depthLeft : depthRight;
        
        return 1 + maxDepth;
        
    }
}
