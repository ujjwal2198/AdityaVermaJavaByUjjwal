/**
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

 // Height Recursion with Balanced BT Condition
class Solution {
    boolean res= true;
    public boolean isBalanced(TreeNode root) {
        // looking like height logic only 
        // differnce between height of Lst and Rst is less than equal 1 
        // here we are applying Height Recursion with 

         Height(root);
         return res;
    }
    public int Height(TreeNode root){
         if(root==null)
            return 0;

        int leftHeight = Height(root.left);
        int rightHeight = Height(root.right);

        if(Math.abs(leftHeight-rightHeight)>1)
        res=false;        

        return 1+Math.max(leftHeight,rightHeight);
        
    }
}
