/**
 * Problem 101. Symmetric Tree
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
class SolutionST {
    public boolean isSymmetric(TreeNode root) {
        
        if(root == null)
            return false;
        
        
        return isSymmAux(root.left, root.right);
        
    }
    
    /**
    * Auxiliary method to make reucursion
    */
    private boolean isSymmAux(TreeNode l, TreeNode r){
        
        boolean eqVal;
        
        if(l == null && r != null)
            return false;
        
        if(l != null && r == null)
            return false;
        
        if(l == null && r == null)
            return true;
        
        if(r.val != l.val)
            eqVal = false;
        else
            eqVal = true;
        
        return eqVal && isSymmAux(l.left, r.right) && isSymmAux(l.right, r.left);
        
    }
    
}
