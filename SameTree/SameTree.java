/**
 * Problem 100. Same Tree
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
    
        boolean eqVal;
        
        if(p == null && q == null)
            return true;
        
        if(p == null && q != null)
            return false;
        if(p != null && q == null)
            return false;
        
        if(p.val != q.val)
            eqVal = false;
        else
            eqVal = true;
        
        if(p.left != null || q.left != null)
            eqVal = eqVal && isSameTree(p.left, q.left);
        
        if(p.right != null || q.right != null)
            eqVal = eqVal && isSameTree(p.right, q.right); 
        
        return eqVal;
        
    }
    
}
