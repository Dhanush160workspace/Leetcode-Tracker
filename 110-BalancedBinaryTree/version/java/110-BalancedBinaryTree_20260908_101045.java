// Last updated: 9/8/2026, 10:10:45 AM
1class Solution {
2    public boolean isBalanced(TreeNode root) {
3        if (root == null){
4            return true;
5        }
6        int left = height(root.left);
7        int right = height(root.right);
8        if (Math.abs(left - right) > 1){
9            return false;
10        }
11        return isBalanced(root.left) && isBalanced(root.right);
12    }
13    public int height(TreeNode root){
14        if (root == null){
15            return 0;
16        }
17        return 1 + Math.max(height(root.left), height(root.right));
18    }
19}