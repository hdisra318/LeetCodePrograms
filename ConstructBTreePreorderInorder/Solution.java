/**
 * Problem 105. Construct Binary Tree from Preorder and Inorder Traversal
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        if (preorder.length == 0 || inorder.length == 0)
            return null;
        
        TreeNode root = new TreeNode(preorder[0]);
        
        //Getting the index of preorder[0] in inorder
        int middle = 0;
        for(int i = 0; i<inorder.length; ++i){
            
            if(inorder[i] == preorder[0]){
                middle = i;
                break;
            }
        }
        
        //Recursion
        root.left = buildTree(Arrays.copyOfRange(preorder, 1, middle+1), Arrays.copyOfRange(inorder, 0, middle));
        
        root.right = buildTree(Arrays.copyOfRange(preorder, middle+1, preorder.length), Arrays.copyOfRange(inorder, middle+1, inorder.length));
        
        return root;
        
        
    }
}
