class Solution {
    int mx=0;
    public int diameterOfBinaryTree(TreeNode root) {
        // left height nikal liya
        // right height nikal liya 
        // karenge wahi bus max ko store karenge 
        int a = Integer.MIN_VALUE;
        int b[] = new int[1];
        return diameter(root);
    }
    public int diameter(TreeNode root){
        if(root==null){
             return 0;
        }
        int lh= height(root.left)-1;
        int rh=height(root.right)-1;
       

        mx= Math.max(lh+rh+2,mx);
        diameter(root.left);
        diameter(root.right);
        return mx;
    }
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right));
    }
}

